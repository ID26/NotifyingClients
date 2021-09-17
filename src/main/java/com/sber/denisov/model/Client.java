package com.sber.denisov.model;

import java.time.LocalDate;
import java.util.Objects;

public class Client {
    private String serName;
    private String givenName;
    private String patronymic;
    private LocalDate dateOfBirth;
    private Address address;

    public Client(String serName, String givenName, String patronymic, LocalDate dateOfBirth) {
        this.serName = serName;
        this.givenName = givenName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public Client() {

    }

    public String getPersonString(){
        return serName+" "+givenName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "serName='" + serName + '\'' +
                ", givenName='" + givenName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return Objects.equals(serName, client.serName) &&
                Objects.equals(givenName, client.givenName) &&
                Objects.equals(patronymic, client.patronymic) &&
                Objects.equals(dateOfBirth, client.dateOfBirth) &&
                Objects.equals(address, client.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serName, givenName, patronymic, dateOfBirth, address);
    }
}
