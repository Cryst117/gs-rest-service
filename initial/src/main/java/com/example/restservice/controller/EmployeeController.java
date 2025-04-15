package com.example.restservice.controller;


import com.example.restservice.entity.Employee;
import com.example.restservice.entity.Employees;
import com.example.restservice.service.EmployeeManager;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeManager employeeManager;

    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @GetMapping("")
    public Employees getAllEmployees() {
        return employeeManager.getAllEmployees();
    }

    @PostMapping("")
    public void addEmployee(@RequestBody Employee newEmployee) {
        employeeManager.addEmployee(newEmployee);
    }

}
