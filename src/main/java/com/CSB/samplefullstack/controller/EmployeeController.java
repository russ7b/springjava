package com.CSB.samplefullstack.controller;

import com.CSB.samplefullstack.entity.Employee;
import com.CSB.samplefullstack.repository.EmployeeRepository;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employee/")
@CrossOrigin("*")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }

}
