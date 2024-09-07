package com.sbi.spring_integration.controller;

import com.sbi.spring_integration.gateway.EmployeeGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/integrate")
public class EmployeeController {
    @Autowired
    public EmployeeGateway employeeGateway;
    @GetMapping(value = "{name}")
    public String getEmployeeName(@PathVariable("name") Message<String> name) {
        return employeeGateway.getEmployeeName(name);
    }
}
