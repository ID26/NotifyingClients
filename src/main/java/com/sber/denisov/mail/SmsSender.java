package com.sber.denisov.mail;

public class SmsSender implements MessageSender {
    private String telephoneNumber;

    @Override
    public boolean sendMessage(Message message) {
        return false;
    }
}
