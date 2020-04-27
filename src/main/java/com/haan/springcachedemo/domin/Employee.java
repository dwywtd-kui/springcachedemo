package com.haan.springcachedemo.domin;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String lastName;
	private String email;
	private Integer gender; //性别 1男  0女
	private Integer dId;
	
	
	public Employee() {
	}

	
	public Employee(String lastName, String email, Integer gender, Integer dId) {
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.dId = dId;
	}
}
