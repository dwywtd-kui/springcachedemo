package com.haan.springcachedemo.service;

import com.haan.springcachedemo.domin.Employee;
import com.haan.springcachedemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Desc
 * @Created By liukuihan
 * @date on 2020/4/27
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee findById(Integer id){
        return employeeRepository.findById(id).orElse(null);
    }
}
