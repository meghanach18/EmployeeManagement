package com.example.employeemannagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.employeemannagement.repository.EmployeeRepository;




@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = EmployeeRepository.class)

public class EmployeeManagementApplication  {
	
public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}
}
