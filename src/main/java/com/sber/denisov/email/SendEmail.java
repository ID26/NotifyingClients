package com.sber.denisov.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
public class SendEmail {
    @Autowired
    private MailSender mailSender;

    public void sendMail() {
        SimpleMailMessage msg = new SimpleMailMessage();

        msg.setTo("pr0j6ct@yandex.com");
        msg.setFrom("pr0j6ct@yandex.com");
        msg.setSubject("Email from myApp2");
        msg.setText("Hi-Hi-Hi-Hi-Hi-Hi-Hi-Hi-Hi-Hi-Hi-Hi-Hi-Hi-Hi-Hi-Hi222222");

        mailSender.send(msg);
    }
}
