package com.example.review.controller;

import com.example.review.model.ChatForm;
import com.example.review.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat")
public class ChatController {
    MessageService messageService;

    public ChatController(MessageService messageService) {
        this.messageService = messageService;
    }

    // we are declaring a chat form object as an argument which allows Spring
    // to initialize a form-backing object for the template
    // and adding chat messages stored by the message service to the model
    @GetMapping
    public String getChatPage(ChatForm chatForm, Model model) {
        model.addAttribute("chatMessages", this.messageService.getChatMessages());
        return "chat";
    }

    @PostMapping
    public String postChatMessage(ChatForm chatForm, Model model) {
        this.messageService.addMessage(chatForm);
        chatForm.setMessageText("");
        model.addAttribute("chatMessages", this.messageService.getChatMessages());
        return "chat";
    }

    // when we want Spring to make some value available in the model
    // without repeating ourselves on every controller method
    // we can write a method like below
    // think of it as almost a bean declaration, but instead of a value appearing in the app context
    // in ends up in the Spring MVC model for the template that it's rendering
    @ModelAttribute("allMessageTypes")
    public String[] allMessageTypes() {
        return new String[]{"Say", "Shout", "Whisper"};
    }
}
