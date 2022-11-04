package com.bridgelabz.employeepayrollapp1.service;

import com.bridgelabz.employeepayrollapp1.entity.Employee;
import com.bridgelabz.employeepayrollapp1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl {
    @Autowired
    EmployeeRepository employeeRepository;



    public Employee saveDetails(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllDetails(){

        return (List<Employee>) employeeRepository.findAll();
    }

    public Employee getDetailID(int id) {
        return employeeRepository.findById(id);
    }

    public Employee updateDetails(Employee employee) {

        return employeeRepository.save(employee);
    }

    public void deletDetails(int id) {
        employeeRepository.deleteById(id);
    }
}
