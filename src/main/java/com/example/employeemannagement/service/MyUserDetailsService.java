package com.example.employeemannagement.service;




import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.employeemannagement.model.Employee;
import com.example.employeemannagement.model.MyUserDetails;

import com.example.employeemannagement.repository.EmployeeRepository;


@Service
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
private EmployeeRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		Optional<Employee> employee =  userRepo.findByName(name);

		employee.orElseThrow(() -> new UsernameNotFoundException("Not found: " + name));

        return employee.map(MyUserDetails::new).get();
	}
	}

    
   
   


