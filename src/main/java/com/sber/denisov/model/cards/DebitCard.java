package com.sber.denisov.model.cards;

import com.sber.denisov.model.Client;

import java.time.LocalDate;

public class DebitCard extends BankCard {

    public DebitCard() {
    }

    public DebitCard(Client owner, String cardAssociationName, String cardNumber, String nameOnCard, String billingAddress, LocalDate validFrom, LocalDate expiryDate, String cardVerificationCode, int dailyWithdrawalLimit, long balance) {
        super(owner, cardAssociationName, cardNumber, nameOnCard, billingAddress, validFrom, expiryDate, cardVerificationCode, dailyWithdrawalLimit, balance);
    }

    @Override
    public String toString() {
        return "DebitCard{" + super.toString() + "} ";
    }
}
