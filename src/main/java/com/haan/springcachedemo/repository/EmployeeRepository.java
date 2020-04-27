package com.haan.springcachedemo.repository;

import com.haan.springcachedemo.domin.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Desc
 * @Created By liukuihan
 * @date on 2020/4/27
 */
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
