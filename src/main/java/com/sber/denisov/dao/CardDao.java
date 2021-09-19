package com.sber.denisov.dao;


import com.sber.denisov.model.cards.BankCard;

public interface CardDao {

    @StorageType
    long addCard(BankCard card);
}
