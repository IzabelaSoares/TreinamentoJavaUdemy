package com.company;
import dao.IDepartment;
import dao.ISeller;
import entities.Department;
import entities.Factory;
import entities.Seller;
import java.sql.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*

        //Sellers
        ISeller sellerService = Factory.createSellerService();

        sellerService.deleteSeller(10);
        List<Seller> sellers = sellerService.selectAllSeller();
        sellers.forEach(s -> System.out.println(s));

        Seller seller2 = new Seller(null, "Velma", "velma@gmail.com", Date.valueOf("1998-11-13"), 4500.0, new Department(1, null));

        sellerService.insertSeller(seller2);

        Seller seller = sellerService.selectSeller(9);
        seller.setName("Velma Scooby");
        sellerService.updateSeller(seller);
        System.out.println(seller);

        //Departments
        IDepartment departmentService = Factory.createDepartmentService();
        departmentService.insertDepartment(new Department(null, "Teste"));

        Department department = departmentService.selectDepartment(5);
        department.setName("TESTE 3");
        departmentService.updateDepartment(department);
        departmentService.deleteDepartment(5);
        System.out.println(department);

        List<Department> departments = departmentService.selectAllDepartment();
        departments.forEach(System.out::println);

        */

    }
}
