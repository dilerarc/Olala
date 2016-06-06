package com.wapempire.test.service;

import org.springframework.stereotype.Component;

@Component
public class MessageService {

    public String getMessage(String message) {
        return message;
    }
}
