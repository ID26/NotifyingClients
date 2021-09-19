package com.sber.denisov.dao;

import com.sber.denisov.exception.DaoException;
import com.sber.denisov.model.Client;

import java.util.HashMap;
import java.util.Map;

public class ClientDaoImplMemory implements ClientDao {
    private ClientDao clientDao;
    private static final Map<Long, Client> clientStorage = new HashMap<>();

    public ClientDaoImplMemory(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @Override
    public Long saveClient(Client client) throws DaoException {
        if (client == null) {
            throw new DaoException();
        }
        long id = client.getId();
        if (!clientStorage.containsKey(id)) {
            clientStorage.put(client.getId(), client);
        }
        return id;
    }

    @Override
    public Client getClient(Long id) throws DaoException {
        if (id == null || !clientStorage.containsKey(id)) {
            throw new DaoException();
        }
        return clientDao.getClient(id);
    }

}
