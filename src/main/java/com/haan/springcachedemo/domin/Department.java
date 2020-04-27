package com.haan.springcachedemo.domin;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data@Entity
@Table(name = "department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String departmentName;

	public Department() {
		super();
	}
	public Department(String departmentName) {
		this.departmentName = departmentName;
	}

}
