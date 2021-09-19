package com.sber.denisov;

import com.sber.denisov.model.Address;
import com.sber.denisov.model.Client;
import com.sber.denisov.model.Passport;
import com.sber.denisov.model.PassportOffice;
import com.sber.denisov.model.cards.BankCard;
import com.sber.denisov.model.cards.DebitCard;

import java.time.LocalDate;

public class AddClientApp {
    public static void main(String[] args) {
        PassportOffice passportOffice = new PassportOffice(1, "1", "ОВД Октябрьского района");
        Passport passport = new Passport("1234", "123456", LocalDate.of(1995, 11, 2), passportOffice);
        Address address = new Address("344000", "Makarios Street",
                "6", null, "11");
        Client client = new Client("Denisov", "Ivan", "Alexandrovich",
                "+79999999999", "ivandenisov26@mail.ru",
                LocalDate.of(1979, 10, 17), address, passport);
        BankCard card = new DebitCard(client, "Master", "1111222233334444",
                String.format("%s %s", client.getGivenName().toUpperCase(), client.getSerName().toUpperCase()),
                client.getAddress().toString(), LocalDate.of(2019, 10, 10),
                LocalDate.of(2022, 10, 10), "324", 250000, 500000);
    }
}
