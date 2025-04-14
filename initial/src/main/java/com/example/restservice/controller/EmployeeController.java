package com.example.restservice.controller;


import com.example.restservice.entity.Employees;
import com.example.restservice.service.EmployeeManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private final EmployeeManager employeeManager;

    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @GetMapping("/employees")
    public Employees getAllEmployees(){
        return employeeManager.getAllEmployees();
    }

}
