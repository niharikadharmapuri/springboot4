package com.niharika;

import com.niharika.entity.Employee;
import com.niharika.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller // is a component
@ResponseBody
//@RestController
@RequestMapping(value="/employees")
public class EmployeeController {

    @Qualifier("employeeServiceImpl")
    @Autowired // property based DI
    private EmployeeService service;


    @RequestMapping(method= RequestMethod.GET)
    public List<Employee> findAll(){

        return service.findAll(); //delegating the implementation to service
    }
    @RequestMapping(method= RequestMethod.GET, value="{id}")

    public Employee findOne(@PathVariable("id") String empId){
        return service.findOne(empId);

    }

    @RequestMapping(method= RequestMethod.POST)

    public Employee create(@RequestBody Employee emp){//requestbody is payload
        return service.create(emp);


    }
    @RequestMapping(method= RequestMethod.PUT, value="{id}")

    public Employee update(@PathVariable("id") String empId, @RequestBody Employee employee){
        return  service.update(empId,employee);

    }
    @RequestMapping(method= RequestMethod.DELETE, value="/{id}")// you specify id in the url itself

    public void delete(@PathVariable("id") String empId){
        service.delete(empId);

        // use PathVariable to extract that from url and put that in empId


    }
}