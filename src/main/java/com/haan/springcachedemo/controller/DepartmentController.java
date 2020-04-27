package com.haan.springcachedemo.controller;

import com.haan.springcachedemo.domin.Department;
import com.haan.springcachedemo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Desc
 * @Created By liukuihan
 * @date on 2020/4/27
 */
@RestController
@RequestMapping("/api/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public Department save(Department department){
        return departmentService.save(department);
    }

    @DeleteMapping
    public void delete(Integer id){
        departmentService.delete(id);
    }

    @GetMapping("/{id}")
    public Department findOne(@PathVariable Integer id){
        return departmentService.findById(id);
    }

    @GetMapping("")
    public List<Department> findAll(){
        return departmentService.findAll();
    }
}
