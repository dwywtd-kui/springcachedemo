package com.haan.springcachedemo.repository;

import com.haan.springcachedemo.domin.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Desc
 * @Created By liukuihan
 * @date on 2020/4/27
 */
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
