package com.sbi.spring_integration.gateway;

import org.springframework.integration.annotation.Gateway;
import org.springframework.messaging.Message;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface EmployeeGateway {
    @Gateway(requestChannel = "request-emp-name-channel")
    public String getEmployeeName(Message<String> name);
}
