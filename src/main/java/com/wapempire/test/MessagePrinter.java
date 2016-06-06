package com.wapempire.test;

import com.wapempire.test.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    @Autowired
    private MessageService service;

    void printMessage() {
        System.out.println(this.service.getMessage("12345"));
    }
}
