package com.example.review;

import com.example.review.service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReviewApplication.class, args);
    }

    @Bean
    public String message() {
        System.out.println("Creating Birthday Bean");
        return "Hello, Spring";
    }

    @Bean
    public String uppercaseMessage(MessageService messageService){
        System.out.println("Upper Case Message Bean Created");
        String upperCaseMessage = messageService.uppercase();
        System.out.println("upperCaseMessage");
        System.out.println(upperCaseMessage);
        return upperCaseMessage;
    }

    @Bean
    public String lowercaseMessage(MessageService messageService){
        System.out.println("Lower Case Message Bean Created");
        String lowercaseMessage = messageService.lowercase();
        System.out.println("lowercaseMessage");
        System.out.println(lowercaseMessage);
        return lowercaseMessage;
    }
}
