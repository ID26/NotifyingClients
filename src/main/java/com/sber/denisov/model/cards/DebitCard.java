package com.sber.denisov.model.cards;


import com.sber.denisov.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DebitCard extends BankCard {

    @Autowired
    public DebitCard(Client owner, String cardAssociationName, String cardNumber, String nameOnCard, String billingAddress, LocalDate validFrom, LocalDate expiryDate, String cardVerificationCode, int dailyWithdrawalLimit, long balance) {
        super(owner, cardAssociationName, cardNumber, nameOnCard, billingAddress, validFrom, expiryDate, cardVerificationCode, dailyWithdrawalLimit, balance);
    }

    @Override
    public String toString() {
        return "DebitCard{" + super.toString() + "} ";
    }
}
