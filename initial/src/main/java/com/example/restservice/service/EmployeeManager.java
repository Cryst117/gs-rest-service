package com.example.restservice.service;

import com.example.restservice.entity.Employee;
import com.example.restservice.entity.Employees;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeManager {

    private final List<Employee> employeeList = new ArrayList<>();

    public EmployeeManager() {

        employeeList.add(new Employee(1, "John", "Doe", "john.doe@example.com", "Software Engineer"));
        employeeList.add(new Employee(2, "Jane", "Smith", "jane.smith@example.com", "Product Manager"));
        employeeList.add(new Employee(3, "Mike", "Brown", "mike.brown@example.com", "Designer"));
    }

    public Employees getAllEmployees() {
        return new Employees(employeeList);
    }

    public void addEmployee(Employee newEmployee) {
        employeeList.add(newEmployee);
    }
}
