package com.example.juke.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.juke.model.Employee;
import com.example.juke.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id){
        Employee employee = employeeRepository.findById(id).orElse(null);
        if (employee != null) {
            return employee;
        } else {
            throw new RuntimeException("Tidak ada employee dengan id: " + id);
        }
    }

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Long id, Employee updatedEmployee){
        Employee existingEmployee = employeeRepository.findById(id).orElse(null);
        if (existingEmployee != null) {
            existingEmployee.setName(updatedEmployee.getName());
            existingEmployee.setEmail(updatedEmployee.getEmail());
            existingEmployee.setPosition(updatedEmployee.getPosition());
            existingEmployee.setSalary(updatedEmployee.getSalary());
            return employeeRepository.save(existingEmployee);
        } else {
            throw new RuntimeException("Tidak ada employee dengan id: " + id);
        }
    }

    public void deleteEmployee (Long id){
        Employee employee = getEmployeeById(id);
        employeeRepository.delete(employee);
    }




}
