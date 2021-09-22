package com.sber.denisov.model;

import com.sber.denisov.model.cards.BankCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class Client {
    private static long countId = 0;
    private long id;
    private String serName;
    private String givenName;
    private String patronymic;
    private String telephoneNumber;
    private String emailAddress;
    private LocalDate dateOfBirth;
    private Address address;
    private Passport passport;

    @Autowired
    public Client(String serName, String givenName, String patronymic, String telephoneNumber, String emailAddress, LocalDate dateOfBirth, Address address, Passport passport) {
        this.id = countId++;
        this.serName = serName;
        this.givenName = givenName;
        this.patronymic = patronymic;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.passport = passport;
    }

    public long getId() {
        return id;
    }

    public String getSerName() {
        return serName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return id == client.id &&
                Objects.equals(serName, client.serName) &&
                Objects.equals(givenName, client.givenName) &&
                Objects.equals(patronymic, client.patronymic) &&
                Objects.equals(telephoneNumber, client.telephoneNumber) &&
                Objects.equals(emailAddress, client.emailAddress) &&
                Objects.equals(dateOfBirth, client.dateOfBirth) &&
                Objects.equals(address, client.address) &&
                Objects.equals(passport, client.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serName, givenName, patronymic, telephoneNumber, emailAddress, dateOfBirth, address, passport);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", serName='" + serName + '\'' +
                ", givenName='" + givenName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address=" + address +
                ", passport=" + passport +
                '}';
    }
}
