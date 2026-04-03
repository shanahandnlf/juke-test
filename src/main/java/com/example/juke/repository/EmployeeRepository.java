package com.example.juke.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.juke.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
