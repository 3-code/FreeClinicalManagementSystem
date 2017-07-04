package com.code.fcms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.code.fcms.util.Department;

@Entity(name="employee")
public class Employee extends Person implements Serializable {
	
	@Column(name = "salary", nullable = false)
	private Double salary;
	
	@Column(name = "phone", nullable = false)
	private Long phone;
	
	@Column(name = "email", nullable = false, unique = true)
	private String email;
	
	@Column(name = "address", nullable = false)
	private String address;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "department", nullable = false)
	private Department department;

	
	private static final long serialVersionUID = 1L;

	public Employee(String name, Date birthday) {
		super(name, birthday);
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
