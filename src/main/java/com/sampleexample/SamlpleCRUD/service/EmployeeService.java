package com.sampleexample.SamlpleCRUD.service;

import com.sampleexample.SamlpleCRUD.entity.Employee;
import com.sampleexample.SamlpleCRUD.repo.EmployeeRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private static Logger log = LogManager.getLogger();

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getListOfEmp() {
       List<Employee> emp = employeeRepository.findAll();
       log.info("List of Employees:" +emp.toString());
       return emp;
    }
}
