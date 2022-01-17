package com.example.review.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private String message;

    public MessageService(String message){
        System.out.println("Creating Message Service");
        this.message = message;
    }

    public String uppercase(){
        System.out.println("Upper Case Method Called");
        return message.toUpperCase();
    }

    public String lowercase(){
        System.out.println("Lower Case Method Called");
        return message.toLowerCase();
    }
}
