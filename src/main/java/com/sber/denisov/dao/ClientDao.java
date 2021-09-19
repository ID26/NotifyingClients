package com.sber.denisov.dao;


import com.sber.denisov.exception.DaoException;
import com.sber.denisov.model.Client;


public interface ClientDao {
    @StorageType
    Long saveClient(Client client) throws DaoException;

    Client getClient(Long id) throws DaoException;
//
//    List<StudentOrder> getGetClient() throws DaoException;

}


