package com.centroxy.serviceImpl;

import com.centroxy.model.Employee;
import com.centroxy.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> listEmployee=new ArrayList<Employee>();
    @Override
    public String persistEmployee(Employee employee) {
        listEmployee.add(employee);
        return "Employee save sucessfully";

    }

    @Override
    public List<Employee> fetchEmployee() {
        return listEmployee;
    }
}
