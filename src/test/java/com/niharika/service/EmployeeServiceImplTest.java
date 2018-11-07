package com.niharika.service;

import com.niharika.entity.Employee;
import com.niharika.repository.EmployeeRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;
import java.util.List;



//@RunWith(SpringRunner.class)
public class EmployeeServiceImplTest {

//    @TestConfiguration
//    static class EmployeeServiceImplTestConfiguration{
//        @Bean
//        public EmployeeService getService(){
//            return new EmployeeServiceImpl();
//        }
//    }
//
//
//    @Autowired
//    private EmployeeService service;
//
//    @MockBean // to mock dependencies
//    private EmployeeRepository repository;
//
//    private List<Employee> employees;
//
//
//
//    @Before
//    public void setup(){
//        Employee emp= new Employee();
//        emp.setId("90");
//        emp.setFirstName("");
//        emp.setLastName("");
//        emp.setEmail("");
//        employees= Collections.singletonList(emp);
//        Mockito.when(repository.findAll()).thenReturn(employees);
//
//    }
//    @After
//    public void cleanup(){
//
//    }
//
//    @Test
//    public void findAll() {
//        List<Employee> result=service.findAll();
//        Assert.assertEquals("emplyee lsit should match", Collections.emptyList(), result);
//    }
//
//    @Test
//    public void findOne() {
//    }
//
//    @Test
//    public void create() {
//    }
//
//    @Test
//    public void update() {
//    }
//
//    @Test
//    public void delete() {
//    }
}