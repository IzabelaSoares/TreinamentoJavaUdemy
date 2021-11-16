package dao;

import entities.Department;
import entities.Seller;

import java.util.List;

public interface ISeller {

    void insertSeller(Seller seller);
    void updateSeller(Seller seller);
    void deleteSeller(Integer id);
    Seller selectSeller(Integer id);
    List<Seller> selectAllSeller();
    List<Seller> selectSellerByDepartment(Department department);

}
