package com.example.demo.employee.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.employee.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
