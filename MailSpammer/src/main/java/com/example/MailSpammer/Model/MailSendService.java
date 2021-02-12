package com.example.MailSpammer.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailSendService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendMail(String receiver) {
        SimpleMailMessage sMessage = new SimpleMailMessage();
        sMessage.setTo(receiver);
        sMessage.setText("Hola soy spam");
        javaMailSender.send(sMessage);
    }    
}