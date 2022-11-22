package com.accolite.au.demo.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRepo {
    Employee Niharika;
    Employee Vandana;


    public Employee getNiharika(){
        return Niharika;
    }
    @Autowired
    @Qualifier("Niharika")
    public void setNiharika(Employee Niharika){
        this.Niharika = Niharika;
    }

    public Employee getVandana(){
        return Vandana;
    }
    @Autowired
    @Qualifier("Vandana")
    public void setVandana(Employee Vandana){
        this.Vandana = Vandana;
    }



}
