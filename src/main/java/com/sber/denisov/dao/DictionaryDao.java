package com.sber.denisov.dao;

import edu.javacorse.studentorder.domain.CountryArea;
import edu.javacorse.studentorder.domain.PassportOffice;
import edu.javacorse.studentorder.domain.RegisterOffice;
import edu.javacorse.studentorder.domain.Street;
import edu.javacorse.studentorder.exception.DaoException;

import java.util.List;

public interface DictionaryDao {
    List<Street> findStreets(String pattern) throws DaoException;
    List<PassportOffice> findPassportOffices(String areaId) throws DaoException;
    List<RegisterOffice> findRegisterOffices(String areaId) throws DaoException;
    List<CountryArea> findAreas(String areaId) throws DaoException;
}
