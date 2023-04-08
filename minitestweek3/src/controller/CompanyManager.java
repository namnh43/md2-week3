package controller;

import model.Employee;
import model.EmployeeFulltime;
import model.EmployeeParttime;

import java.util.ArrayList;

public class CompanyManager {
    public ArrayList<Employee> listEmployee = new ArrayList<>();

    public CompanyManager() {
    }
    public void init() {
        addEmployee(new EmployeeFulltime("1","nguyen van a", 20, "0123456789", "a.com.vn", "hanoi", 10000000, 0, 20000000));
        addEmployee(new EmployeeFulltime("2","nguyen van b", 21, "0123456789", "b.com.vn", "hanoi", 5000000, 700000, 13000000));
        addEmployee(new EmployeeParttime("8","nguyen thi xoai",19,"0987654321","xoai.com.vn","sai gon", 60));
        addEmployee(new EmployeeParttime("7","nguyen thi buoi",18,"0987654321","buoi.com.vn","sai gon", 50));
        addEmployee(new EmployeeFulltime("3","nguyen van c", 22, "0123456789", "c.com.vn", "hanoi", 2000000, 200000, 10000000));
        addEmployee(new EmployeeParttime("9","nguyen thi cam",20,"0987654321","cam.com.vn","sai gon", 70));
        addEmployee(new EmployeeFulltime("6","nguyen van f", 25, "0123456789", "f.com.vn", "hanoi", 500000, 100000, 10000000));
        addEmployee(new EmployeeParttime("11","nguyen thi mit",17,"0987654321","mit.com.vn","sai gon", 95));
        addEmployee(new EmployeeFulltime("4","nguyen van d", 23, "0123456789", "d.com.vn", "hanoi", 1000000, 500000, 15000000));
        addEmployee(new EmployeeParttime("10","nguyen thi quyt",21,"0987654321","quyt.com.vn","sai gon", 80));
        addEmployee(new EmployeeFulltime("5","nguyen van e", 24, "0123456789", "e.com.vn", "hanoi", 20000000, 2000000, 30000000));
        addEmployee(new EmployeeParttime("12","nguyen thi tao",15,"0987654321","tao.com.vn","sai gon", 100));
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
    public ArrayList<Employee> getFulltime() {
        ArrayList<Employee> fulltime = new ArrayList<>();
        for (Employee e: listEmployee) {
            if (e instanceof EmployeeFulltime) {
                fulltime.add(e);
            }
        }
        return fulltime;
    }
}
