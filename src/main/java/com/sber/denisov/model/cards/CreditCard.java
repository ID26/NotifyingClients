package com.sber.denisov.model.cards;

import com.sber.denisov.model.Client;

import java.time.LocalDate;

public class CreditCard extends BankCard {
    private long creditLimit;
    private int firstControlDate;
    private int secondControlDate;
    private int taxFreePeriod;

    public CreditCard() {
    }

    public CreditCard(Client owner, String cardAssociationName, String cardNumber, String nameOnCard, String billingAddress, LocalDate validFrom, LocalDate expiryDate, String cardVerificationCode, int dailyWithdrawalLimit, long balance, long creditLimit, int firstControlDate, int secondControlDate, int taxFreePeriod) {
        super(owner, cardAssociationName, cardNumber, nameOnCard, billingAddress, validFrom, expiryDate, cardVerificationCode, dailyWithdrawalLimit, balance);
        this.creditLimit = creditLimit;
        this.firstControlDate = firstControlDate;
        this.secondControlDate = secondControlDate;
        this.taxFreePeriod = taxFreePeriod;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(long creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getFirstControlDate() {
        return firstControlDate;
    }

    public void setFirstControlDate(int firstControlDate) {
        this.firstControlDate = firstControlDate;
    }

    public int getSecondControlDate() {
        return secondControlDate;
    }

    public void setSecondControlDate(int secondControlDate) {
        this.secondControlDate = secondControlDate;
    }

    public int getTaxFreePeriod() {
        return taxFreePeriod;
    }

    public void setTaxFreePeriod(int taxFreePeriod) {
        this.taxFreePeriod = taxFreePeriod;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "creditLimit=" + creditLimit +
                ", firstControlDate=" + firstControlDate +
                ", secondControlDate=" + secondControlDate +
                ", taxFreePeriod=" + taxFreePeriod +
                super.toString() + "} ";
    }
}
