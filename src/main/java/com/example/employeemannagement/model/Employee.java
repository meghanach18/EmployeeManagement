package com.example.employeemannagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	
	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="employee_id")
		private int id;
		@Column(name="employee_name")
		private String name;
		@Column(name="employee_password")
		 private String password;
		
		@Column(name="employee_roles")
		    private String roles;

		@Column(name="employee_designation")
		private String designation;
		@Column(name="employee_grade")
		private String grade;
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		
		
		

		public Employee(int id, String name, String password, String roles, String designation,
				String grade, String address, String phone) {
			super();
			this.id = id;
			this.name = name;
			this.password = password;
			
			this.roles = roles;
			this.designation = designation;
			this.grade = grade;
			this.address = address;
			this.phone = phone;
		}
		public Employee() {
			
			
		}


		@Column(name="employee_address")
		private String address;
		
		@Column(name="employee_phone")
		private String phone;
		   
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		public String getRoles() {
			return roles;
		}
		public void setRoles(String roles) {
			this.roles = roles;
		}
		
}


