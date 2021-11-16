package database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Database {

    private static Connection conexao = null;

    public static Connection criarConexao(){
        if(conexao == null){
            try{
                Properties properties = carregarPropriedades();
                String url = properties.getProperty("url");
                String user = properties.getProperty("user");
                String password = properties.getProperty("password");
                conexao = DriverManager.getConnection(url, user, password);
            }
            catch (SQLException exception){
                throw new DatabaseException(exception.getMessage());
            }
        } return conexao;
    }

    public static void fecharConexao(){
        if(conexao != null){
            try{
                conexao.close();
            }
            catch (SQLException exception){
                throw new DatabaseException(exception.getMessage());
            }
        }
    }

    public static void fecharStatement(Statement statement){
        if(statement != null){
            try{
                statement.close();
            }
            catch (SQLException exception){
                throw new DatabaseException(exception.getMessage());
            }
        }
    }

    public static void fecharResultSet(ResultSet resultSet){
        if(resultSet != null){
            try{
                resultSet.close();
            }
            catch (SQLException exception){
                throw new DatabaseException(exception.getMessage());
            }
        }
    }

    private static Properties carregarPropriedades(){
        try(FileInputStream arquivo = new FileInputStream("database.properties")){
            Properties properties = new Properties();
            properties.load(arquivo);
            return properties;
        }
        catch (IOException exception){
            throw new DatabaseException(exception.getMessage());
        }
    }

}
