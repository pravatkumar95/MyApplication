package com.centroxy.controller;

import com.centroxy.model.Employee;
import com.centroxy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @PostMapping("/persistEmployee")
    public String persistEmployee(@RequestBody Employee emp) {

       return employeeService.persistEmployee(emp);

    }

    @GetMapping("/fetchEmployee")
    public List<Employee> getAllEmployees() {

        return employeeService.fetchEmployee();
    }
}
