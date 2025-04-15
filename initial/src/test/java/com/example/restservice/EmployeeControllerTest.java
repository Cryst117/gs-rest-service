package com.example.restservice;

import com.example.restservice.controller.EmployeeController;
import com.example.restservice.entity.Employee;
import com.example.restservice.service.EmployeeManager;
import org.junit.jupiter.api.Test;


public class EmployeeControllerTest {

    @Test
    public void testGetEmployees() {
        EmployeeManager manager = new EmployeeManager();
        EmployeeController controller = new EmployeeController(manager);
        controller.getAllEmployees();
    }

    @Test
    public void testAddEmployee() {
        EmployeeManager manager = new EmployeeManager();
        EmployeeController controller = new EmployeeController(manager);

        Employee emp = new Employee();
        emp.setEmployeeId(1);
        emp.setFirstName("Test");
        emp.setLastName("User");
        emp.setEmail("test@example.com");
        emp.setTitle("Tester");

        controller.addEmployee(emp);
    }
}
