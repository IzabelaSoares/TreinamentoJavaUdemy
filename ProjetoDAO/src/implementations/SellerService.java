package implementations;
import dao.ISeller;
import database.Database;
import database.DatabaseException;
import entities.Department;
import entities.Seller;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SellerService implements ISeller {

    private Connection connection = null;

    public SellerService(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertSeller(Seller seller) {
        PreparedStatement st = null;
        try {
            st = connection.prepareStatement(
                    "INSERT INTO seller "
                            + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                            + "VALUES "
                            + "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, seller.getName());
            st.setString(2, seller.getEmail());
            st.setDate(3, new Date(seller.getBirthDate().getTime()));
            st.setDouble(4, seller.getBaseSalary());
            st.setInt(5, seller.getDepartment().getId());

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    seller.setId(id);
                }
                Database.fecharResultSet(rs);
            }
            else {
                throw new DatabaseException("Unexpected error! No rows affected!");
            }
        }
        catch (SQLException e) {
            throw new DatabaseException(e.getMessage());
        }
        finally {
            Database.fecharStatement(st);
        }
    }

    @Override
    public void updateSeller(Seller seller) {
        PreparedStatement st = null;
        try {
            st = connection.prepareStatement("UPDATE seller SET Name = ?, Email = ?, BirthDate = ?, " +
                                                 "BaseSalary = ?, DepartmentId = ? WHERE Id = ?");
            st.setString(1, seller.getName());
            st.setString(2, seller.getEmail());
            st.setDate(3, new Date(seller.getBirthDate().getTime()));
            st.setDouble(4, seller.getBaseSalary());
            st.setInt(5, seller.getDepartment().getId());
            st.setInt(6, seller.getId());
            st.executeUpdate();
        }
        catch (SQLException e) {
            throw new DatabaseException(e.getMessage());
        }
        finally {
            Database.fecharStatement(st);
        }
    }

    @Override
    public void deleteSeller(Integer id) {
        PreparedStatement st = null;
        try{
            st = connection.prepareStatement("DELETE FROM seller WHERE Id = ?");
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
    public Seller selectSeller(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = connection.prepareStatement("SELECT seller.*,department.Name as DepName "
                            + "FROM seller INNER JOIN department ON seller.DepartmentId = department.Id WHERE seller.Id = ?");

            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                Department department = instantiateDepartment(rs);
                Seller seller = instantiateSeller(rs, department);
                return seller;
            }
            return null;
        }
        catch (SQLException e) {
            throw new DatabaseException(e.getMessage());
        }
        finally {
            Database.fecharStatement(st);
            Database.fecharResultSet(rs);
        }
    }

    @Override
    public List<Seller> selectSellerByDepartment(Department department) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = connection.prepareStatement(
                    "SELECT seller.*,department.Name as DepName "
                            + "FROM seller INNER JOIN department "
                            + "ON seller.DepartmentId = department.Id "
                            + "WHERE DepartmentId = ? "
                            + "ORDER BY Name");

            st.setInt(1, department.getId());

            rs = st.executeQuery();

            List<Seller> sellers = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();

            while (rs.next()) {
                department = map.get(rs.getInt("DepartmentId"));
                if (department == null) {
                    department = instantiateDepartment(rs);
                    map.put(rs.getInt("DepartmentId"), department);
                }
                Seller seller = instantiateSeller(rs, department);
                sellers.add(seller);
            }
            return sellers;
        }
        catch (SQLException e) {
            throw new DatabaseException(e.getMessage());
        }
        finally {
            Database.fecharStatement(st);
            Database.fecharResultSet(rs);
        }
    }

    @Override
    public List<Seller> selectAllSeller() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = connection.prepareStatement("SELECT seller.*,department.Name as DepName "
                            + "FROM seller INNER JOIN department "
                            + "ON seller.DepartmentId = department.Id ORDER BY Name");

            rs = st.executeQuery();

            List<Seller> sellers = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();

            while (rs.next()) {
            Department department = map.get(rs.getInt("DepartmentId"));
                if (department == null) {
                    department = instantiateDepartment(rs);
                    map.put(rs.getInt("DepartmentId"), department);
                }
                Seller seller = instantiateSeller(rs, department);
                sellers.add(seller);
            }
            return sellers;
        }
        catch (SQLException e) {
            throw new DatabaseException(e.getMessage());
        }
        finally {
            Database.fecharStatement(st);
            Database.fecharResultSet(rs);
        }
    }


    public Department instantiateDepartment(ResultSet resultSet) throws SQLException {
        Department department = new Department();
        department.setId(resultSet.getInt("DepartmentId"));
        department.setName(resultSet.getString("DepName"));
        return department;
    }

    public Seller instantiateSeller(ResultSet resultSet, Department department) throws SQLException {
        Seller seller = new Seller();
        seller.setId(resultSet.getInt("Id"));
        seller.setName(resultSet.getString("Name"));
        seller.setEmail(resultSet.getString("Email"));
        seller.setBaseSalary(resultSet.getDouble("BaseSalary"));
        seller.setBirthDate(resultSet.getDate("BirthDate"));
        seller.setDepartment(department);
        return seller;
    }

}
