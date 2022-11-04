package com.bridgelabz.employeepayrollapp1.repository;

import com.bridgelabz.employeepayrollapp1.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    Employee findById(int id);
}
