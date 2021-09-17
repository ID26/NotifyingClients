package com.sber.denisov.model.cards;

import com.sber.denisov.model.Client;
import com.sber.denisov.model.PassportOffice;

import java.time.LocalDate;

public abstract class BankCard {
    private Client owner;
    private String cardNumber;
    private String cvc2;
    private LocalDate issueDate;
    private LocalDate validTo;

    public BankCard(Client owner, String cardNumber, String cvc2, LocalDate issueDate, LocalDate validTo) {
        this.owner = owner;
        this.cardNumber = cardNumber;
        this.cvc2 = cvc2;
        this.issueDate = issueDate;
        this.validTo = validTo;
    }
}
