package entities;
import dao.IDepartment;
import dao.ISeller;
import database.Database;
import implementations.DepartmentService;
import implementations.SellerService;

public class Factory {

    public static ISeller createSellerService(){
        return new SellerService(Database.criarConexao());
    }

    public static IDepartment createDepartmentService(){
        return new DepartmentService(Database.criarConexao());
    }
}
