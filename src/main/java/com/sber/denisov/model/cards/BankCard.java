package com.sber.denisov.model.cards;

import com.sber.denisov.model.Client;



import java.time.LocalDate;
import java.util.Objects;

public abstract class BankCard {
    private Client owner;
    private String cardAssociationName;
    private String cardNumber;
    private String nameOnCard;
    private String billingAddress;
    private LocalDate validFrom;
    private LocalDate expiryDate;
    private String cardVerificationCode;
    private int dailyWithdrawalLimit;
    private long balance;

    public BankCard() {
    }

    public BankCard(Client owner, String cardAssociationName, String cardNumber, String nameOnCard, String billingAddress, LocalDate validFrom, LocalDate expiryDate, String cardVerificationCode, int dailyWithdrawalLimit, long balance) {
        this.owner = owner;
        this.cardAssociationName = cardAssociationName;
        this.cardNumber = cardNumber;
        this.nameOnCard = nameOnCard;
        this.billingAddress = billingAddress;
        this.validFrom = validFrom;
        this.expiryDate = expiryDate;
        this.cardVerificationCode = cardVerificationCode;
        this.dailyWithdrawalLimit = dailyWithdrawalLimit;
        this.balance = balance;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public String getCardAssociationName() {
        return cardAssociationName;
    }

    public void setCardAssociationName(String cardAssociationName) {
        this.cardAssociationName = cardAssociationName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCardVerificationCode() {
        return cardVerificationCode;
    }

    public void setCardVerificationCode(String cardVerificationCode) {
        this.cardVerificationCode = cardVerificationCode;
    }

    public int getDailyWithdrawalLimit() {
        return dailyWithdrawalLimit;
    }

    public void setDailyWithdrawalLimit(int dailyWithdrawalLimit) {
        this.dailyWithdrawalLimit = dailyWithdrawalLimit;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankCard)) return false;
        BankCard card = (BankCard) o;
        return dailyWithdrawalLimit == card.dailyWithdrawalLimit &&
                balance == card.balance &&
                Objects.equals(owner, card.owner) &&
                Objects.equals(cardAssociationName, card.cardAssociationName) &&
                Objects.equals(cardNumber, card.cardNumber) &&
                Objects.equals(nameOnCard, card.nameOnCard) &&
                Objects.equals(billingAddress, card.billingAddress) &&
                Objects.equals(validFrom, card.validFrom) &&
                Objects.equals(expiryDate, card.expiryDate) &&
                Objects.equals(cardVerificationCode, card.cardVerificationCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, cardAssociationName, cardNumber, nameOnCard, billingAddress, validFrom, expiryDate, cardVerificationCode, dailyWithdrawalLimit, balance);
    }

    @Override
    public String toString() {
        return  "owner='" + owner + '\'' +
                ", cardAssociationName='" + cardAssociationName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", nameOnCard='" + nameOnCard + '\'' +
                ", billingAddress='" + billingAddress + '\'' +
                ", validFrom=" + validFrom +
                ", expiryDate=" + expiryDate +
                ", cardVerificationCode='" + cardVerificationCode + '\'' +
                ", dailyWithdrawalLimit=" + dailyWithdrawalLimit + '\'' +
                ", balance=" + balance;
    }
}
