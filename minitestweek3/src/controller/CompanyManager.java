package controller;

import model.Employee;
import model.EmployeeParttime;

import java.util.ArrayList;

public class CompanyManager {
    public ArrayList<Employee> listEmployee = new ArrayList<>();

    public CompanyManager() {
    }
    public void addEmployee(Employee e) {
        listEmployee.add(e);
    }
    public double getAverageSalary(){
        double total = 0;
        for (Employee employee: listEmployee) {
            total += employee.getMonthlySalary();
        }
        return total/listEmployee.size();
    }
    public ArrayList<Employee> getListLowSalary() {
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee employee: listEmployee) {
            if (employee.getMonthlySalary() < getAverageSalary()) {
                result.add(employee);
            }
        }
        return result;
    }
    public double parttimeSalary() {
        double parttimeSalary = 0;
        for (Employee employee: listEmployee) {
            parttimeSalary += employee.getMonthlySalary();
        }
        return parttimeSalary;
    }
}
