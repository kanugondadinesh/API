package com.example.rest.repository;

import com.example.rest.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<Employee , Long>
{    
}
