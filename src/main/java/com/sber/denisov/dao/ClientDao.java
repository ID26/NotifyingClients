package com.sber.denisov.dao;



import java.util.List;

public interface ClientDao {
    Long saveClient(StudentOrder so) throws DaoException;

    List<StudentOrder> getGetClient() throws DaoException;
}


