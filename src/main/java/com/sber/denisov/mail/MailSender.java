package com.sber.denisov.mail;


import org.springframework.mail.javamail.JavaMailSenderImpl;

public class MailSender implements MessageSender {
    private String email;
    private JavaMailSenderImpl sender = new JavaMailSenderImpl();

    @Override
    public boolean sendMessage(Message message) {
        return false;
    }
}

