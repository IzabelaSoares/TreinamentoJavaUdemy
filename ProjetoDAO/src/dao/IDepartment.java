package dao;

import entities.Department;

import java.util.List;

public interface IDepartment {

    void insertDepartment(Department department);
    void updateDepartment(Department department);
    void deleteDepartment(Integer id);
    Department selectDepartment(Integer id);
    List<Department> selectAllDepartment();

}
