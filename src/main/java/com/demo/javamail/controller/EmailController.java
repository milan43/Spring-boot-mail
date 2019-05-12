package com.demo.javamail.controller;

/*
 @Author Milan Paudyal
 @Date 5/11/19, Sat
*/

import com.demo.javamail.resources.EmailDto;
import com.demo.javamail.service.EmailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send")
    public void sendEmail() {
        emailService.sendEmail(EmailDto.builder()
                .receiverEmail("milanpaudyal43@gmail.com")
                .receiverName("Novice Geeker")
                .subject("Test email")
                .message("Have a nice day!!!")
                .build());
    }
}
