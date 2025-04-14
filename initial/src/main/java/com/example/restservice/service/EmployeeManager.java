package com.example.restservice.service;

import com.example.restservice.entity.Employee;
import com.example.restservice.entity.Employees;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeManager {

    public Employees getAllEmployees(){

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "John", "Doe", "john.doe@example.com", "Software Engineer"));
        list.add(new Employee(2, "Jane", "Smith", "jane.smith@example.com", "Product Manager"));
        list.add(new Employee(3, "Mike", "Brown", "mike.brown@example.com", "Designer"));

        return new Employees(list);

    }
}
