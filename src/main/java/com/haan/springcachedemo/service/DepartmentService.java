package com.haan.springcachedemo.service;

import com.haan.springcachedemo.domin.Department;
import com.haan.springcachedemo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Desc
 * @Created By liukuihan
 * @date on 2020/4/27
 */
@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department save(Department department){
        return departmentRepository.save(department);
    }

    public Department findById(Integer id){
        return departmentRepository.findById(id).orElse(null);
    }

    public List<Department> findAll(){
        return departmentRepository.findAll();
    }

    public void delete(Integer id){
        departmentRepository.deleteById(id);
    }
}
