package com.niharika.repository;

import com.niharika.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee, String> {
    //Optional findByEmail(String email);
   // List<Employee> findByFirstNameAndLastName(String firstName, String lastName);

}
