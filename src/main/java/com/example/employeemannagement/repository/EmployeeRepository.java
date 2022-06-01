package com.example.employeemannagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeemannagement.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	 public Optional<Employee> findByName(String name);
}
