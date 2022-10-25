package com.conrad.managementsystem.controller;
import com.conrad.managementsystem.entity.Employee;
import com.conrad.managementsystem.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping("/")
    public List<Employee> index(){
        return employeeMapper.findAll();
    }
}
