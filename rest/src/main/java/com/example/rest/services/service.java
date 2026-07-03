package com.example.rest.services;

import com.example.rest.model.Employee;
import com.example.rest.repository.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
    
    @Autowired
    repository res;

    public List<Employee>getEmployees()
    {
        return res.findAll();
    }
    public Employee getEmployee(Long id)
    {
        return res.findById(id).orElse(null);
    }
    public Employee saveEmployee(Employee emp)
    {
        return res.save(emp);
    }
    public Employee updateEmployee(Long id,Employee emp)
    {
        Employee employ=res.findById(id).orElse(null);
        if(employ!=null)
        {
            employ.setName(emp.getName());
            employ.setDept(emp.getDept());
            employ.setSalary(emp.getSalary());

            return res.save(employ);
        }
        return null;
    }
    public void deleteEmployee(Long id)
    {
        res.deleteById(id);
    }
}
