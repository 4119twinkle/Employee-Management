package com.accolite.au.demo.demo.config;

import com.accolite.au.demo.demo.beans.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages = {"com.example.demo.beans","com.example.demo.Service","com.example.demo.Controller"})

public class EmployeeConfig {
    @Bean("Niharika")
    public Employee emp1() {
        return new Employee(6904, "Niharika", "niharika90@gmail.com");

    }

    @Bean("Vandana")
    public Employee emp2() {
        return new Employee(6905, "Vandana", "vandana690@gmail.com");

    }
}
