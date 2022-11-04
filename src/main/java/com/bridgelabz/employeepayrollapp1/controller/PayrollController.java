package com.bridgelabz.employeepayrollapp1.controller;

import com.bridgelabz.employeepayrollapp1.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp1.entity.Employee;
import com.bridgelabz.employeepayrollapp1.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")
public class PayrollController {
    @Autowired
    EmployeeServiceImpl employeeServiceImpl;
    @PostMapping("/save/details")
    public Employee saveDetails(@RequestBody Employee employee){
        Employee employeeDetails = employeeServiceImpl.saveDetails(employee);
        return employeeDetails;
    }

    @GetMapping("/getAllDetails")
    public List<Employee> getAllDetails(){
        List<Employee> candidateDetails = employeeServiceImpl.getAllDetails();

        return candidateDetails;
    }

    @GetMapping("/get/{id}")
    public Employee getDetailID(@PathVariable int id){
        Employee detailID =employeeServiceImpl.getDetailID(id);

        return detailID;
    }

    @PutMapping("/updateDetails")
    public Employee updateDetails(@RequestBody Employee employee){
        Employee empDetail =employeeServiceImpl.updateDetails(employee);

        return empDetail;
    }

    @DeleteMapping("/deletDetails/{id}")
    public void deletDetails(@PathVariable int id){
        employeeServiceImpl.deletDetails(id);

    }


}
