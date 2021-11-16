package implementations;
import dao.IDepartment;
import database.Database;
import database.DatabaseException;
import entities.Department;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DepartmentService implements IDepartment {

    private Connection connection = null;

    public DepartmentService(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertDepartment(Department department) {
        PreparedStatement st = null;
        try{
            st = connection.prepareStatement("INSERT INTO department (Name) VALUES(?)",Statement.RETURN_GENERATED_KEYS);
            st.setString(1, department.getName());
            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    department.setId(id);
                }
                Database.fecharResultSet(rs);
            }
            else {
                throw new DatabaseException("Unexpected error! No rows affected!");
            }
        }
        catch (SQLException e){
            throw new DatabaseException(e.getMessage());
        }
        finally {
            Database.fecharStatement(st);
        }
    }

    @Override
    public void updateDepartment(Department department) {
        PreparedStatement st = null;
        try{
            st = connection.prepareStatement("UPDATE department SET Name = ? WHERE Id = ?");
            st.setString(1, department.getName());
            st.setInt(2, department.getId());
            st.executeUpdate();

        }
        catch (SQLException e){
            throw new DatabaseException(e.getMessage());
        }
        finally {
            Database.fecharStatement(st);
        }
    }

    @Override
    public void deleteDepartment(Integer id) {
        PreparedStatement st = null;
        try{
            st = connection.prepareStatement("DELETE FROM department WHERE Id = ?");
            st.setInt(1,id);
            st.executeUpdate();
        }
        catch (SQLException e){
            throw new DatabaseException(e.getMessage());
        }
        finally {
            Database.fecharStatement(st);
        }
    }

    @Override
    public Department selectDepartment(Integer id) {
        PreparedStatement st = null;
        ResultSet resultSet = null;
        try {
            st = connection.prepareStatement("SELECT Id, Name FROM department WHERE Id = ?");
            st.setInt(1, id);
            resultSet = st.executeQuery();
            if (resultSet.next()) {
                Department department = new Department();
                department.setId(resultSet.getInt("Id"));
                department.setName(resultSet.getString("Name"));
                return department;
            }
            return null;
        }
        catch (SQLException e) {
            throw new DatabaseException(e.getMessage());
        }
        finally {
            Database.fecharStatement(st);
            Database.fecharResultSet(resultSet);
        }
    }

    @Override
    public List<Department> selectAllDepartment() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = connection.prepareStatement("SELECT * FROM department ORDER BY Name");
            rs = st.executeQuery();

            List<Department> departments = new ArrayList<>();

            while (rs.next()) {
                Department department = new Department(rs.getInt("Id"), rs.getString("Name"));
                departments.add(department);
            }
            return departments;
        }
        catch (SQLException e) {
            throw new DatabaseException(e.getMessage());
        }
        finally {
            Database.fecharStatement(st);
            Database.fecharResultSet(rs);
        }
    }


}
