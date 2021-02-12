package com.example.MailSpammer.Controller;

import com.example.MailSpammer.Model.MailSendService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
    
    @Autowired
    MailSendService mailSendService;

    

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

    @RequestMapping(value = "getMail", method = RequestMethod.POST)
    public String sendMail(String mail, int count) {
        for (int i=0; i<count; i++) {
            mailSendService.sendMail(mail);
        }        
        return "redirect:/";
    }


}
