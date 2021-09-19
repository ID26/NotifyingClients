package com.sber.denisov.mail;

import java.time.LocalDate;

public class Message {
    private String sender;
    private String recipient;
    private String text;
    private LocalDate localDate;

    public Message(String sender, String recipient, String text, LocalDate localDate) {
        this.sender = sender;
        this.recipient = recipient;
        this.text = text;
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return String.format("");
    }
}
