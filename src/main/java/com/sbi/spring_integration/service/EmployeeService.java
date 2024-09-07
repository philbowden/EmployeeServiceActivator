package com.sbi.spring_integration.service;

import org.springframework.messaging.Message;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @ServiceActivator(inputChannel = "request-emp-name-channel")
    public void getEmployeeName(Message<String> name) {
        MessageChannel replyChannel = (MessageChannel) name.getHeaders().getReplyChannel();
        if (replyChannel != null) replyChannel.send(name);
    }
}
