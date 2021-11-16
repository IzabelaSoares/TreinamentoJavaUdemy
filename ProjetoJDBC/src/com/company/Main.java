package com.company;
import database.Database;
import database.DatabaseException;
import database.DatabaseIntegrityException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        selectDatabase();
        insertDatabase();
        updateDatabase();
        deleteDatabase();
    }

    public static void updateDatabase(){
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = Database.criarConexao();
            ps = con.prepareStatement("UPDATE seller SET BaseSalary = BaseSalary + ? WHERE DepartmentId = ?");
            ps.setDouble(1, 200.0);
            ps.setInt(2, 2);

            int linhasAfedatas = ps.executeUpdate();
            if(linhasAfedatas > 0){
                System.out.println("Linhas afetadas: " + linhasAfedatas);
            }
        }
        catch (SQLException exception){
            throw new DatabaseException(exception.getMessage());
        }
        finally {
            Database.fecharStatement(ps);
            Database.fecharConexao();
        }
    }

    public static void deleteDatabase(){
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = Database.criarConexao();
            ps = con.prepareStatement("DELETE FROM seller WHERE DepartmentId = ? and Name = ?");
            ps.setInt(1,1);
            ps.setString(2, "Amanda");

            int linhasAfedatas = ps.executeUpdate();
            if(linhasAfedatas > 0){
                System.out.println("Linhas afetadas: " + linhasAfedatas);
            }
        }
        catch (SQLException exception){
            throw new DatabaseIntegrityException(exception.getMessage());
        }
        finally {
            Database.fecharStatement(ps);
            Database.fecharConexao();
        }
    }

    public static void insertDatabase(){
        Connection con = null;
        PreparedStatement ps = null;
        try{
            con = Database.criarConexao();
            ps = con.prepareStatement("" +
                    "INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, "Amanda");
            ps.setString(2, "amanda.soares@gmail.com");
            ps.setDate(3, Date.valueOf("1998-12-16"));
            ps.setDouble(4, 2000.0);
            ps.setInt(5, 1);

            int linhasAfedatas = ps.executeUpdate();
            if(linhasAfedatas > 0){
                ResultSet resultSet = ps.getGeneratedKeys();
                while (resultSet.next()){
                    System.out.println(resultSet.getInt(1));
                }
                Database.fecharResultSet(resultSet);
            }
        }
        catch (SQLException exception){
            throw new DatabaseException(exception.getMessage());
        }
        finally {
            Database.fecharStatement(ps);
            Database.fecharConexao();
        }
    }

    public static void selectDatabase(){
        Connection conexao = null;
        Statement instrucao = null;
        ResultSet resultado = null;
        try{
            conexao = Database.criarConexao();
            instrucao = conexao.createStatement();
            resultado = instrucao.executeQuery("SELECT * FROM department");
            while (resultado.next()){
                System.out.println(resultado.getInt("Id") + "," + resultado.getString("Name"));
            }
        }
        catch (SQLException exception){
            throw new DatabaseException(exception.getMessage());
        }
        finally {
            Database.fecharStatement(instrucao);
            Database.fecharResultSet(resultado);
            Database.fecharConexao();
        }
    }
}
