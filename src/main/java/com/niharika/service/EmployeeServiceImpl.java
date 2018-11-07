package com.niharika.service;

import com.niharika.entity.Employee;
import com.niharika.exception.BadRequestException;
import com.niharika.exception.ResourceNotFoundException;
import com.niharika.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository repository;

    @Transactional(readOnly = true)
    public List<Employee> findAll() {

        return (List<Employee>) repository.findAll();
    } //inbuilt

    @Transactional(readOnly = true)
    public Employee findOne(String id) {
        Optional<Employee> existing = repository.findById(id); //inbuilt
        if (!existing.isPresent()) {
            throw new ResourceNotFoundException("Employee with id " + id + " doesn't exist.");
        }
        return existing.get();
    }

    @Transactional
    public Employee create(Employee emp) {
        return repository.save(emp);
    }

    @Transactional
    public Employee update(String id, Employee emp) {
        Optional<Employee> existing = repository.findById(id); //inbuilt
        if (!existing.isPresent()) {
            throw new ResourceNotFoundException("Employee with id " + id + " doesn't exist.");
        }
        return repository.save(emp);
    }

    @Transactional
    public void delete(String id) {
        Optional<Employee> existing = repository.findById(id); //inbuilt
        if (!existing.isPresent()) {
            throw new ResourceNotFoundException("Employee with id " + id + " doesn't exist.");
        }
        repository.delete(existing.get());
    }
}
