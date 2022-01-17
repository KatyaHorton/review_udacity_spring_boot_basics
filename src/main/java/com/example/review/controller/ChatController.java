package com.example.review.controller;

import com.example.review.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat")
public class ChatController {
    MessageService messageService;

    public ChatController(MessageService messageService) { this.messageService = messageService; }

    @GetMapping
    public String getChatPage
}
