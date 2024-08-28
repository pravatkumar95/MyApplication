package com.centroxy.service;

import com.centroxy.model.Employee;

import java.util.List;

public interface EmployeeService {
    String persistEmployee(Employee employee) ;
    List<Employee> fetchEmployee();

}
