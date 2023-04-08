import controller.CompanyManager;
import model.EmployeeFulltime;
import model.EmployeeParttime;

import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        CompanyManager manager = new CompanyManager();
        manager.init();
        //print list employee
        System.out.println(manager.listEmployee);
        //avarage salary
        System.out.println(manager.getAverageSalary());
        //listout lower salary employee
        System.out.println(manager.getListLowSalary());
        //total parttime salary
        System.out.println(manager.getAverageSalary());
        //sorted employee
        Collections.sort(manager.listEmployee);
        System.out.println(manager.getFulltime());
    }
}
