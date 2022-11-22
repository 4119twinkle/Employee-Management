package com.accolite.au.demo.demo.controller;

import com.accolite.au.demo.demo.beans.Employee;
import com.accolite.au.demo.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    EmployeeService service;

    public EmployeeService getService(){
        return service;
    }

    @Autowired
    public void setService(EmployeeService service){
        this.service = service;
    }

    @GetMapping("/Niharika")
    public List<Employee> getEmployee(){
        return getService().getEmployeeDetails();

    }

}
