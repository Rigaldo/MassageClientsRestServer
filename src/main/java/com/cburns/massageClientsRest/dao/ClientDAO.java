package com.cburns.massageClients.dao;

import com.cburns.massageClients.entity.Client;

import java.util.List;

public interface ClientDAO {
    List<Client> getAllClients();

    void saveClient(Client client);

    Client getClient(int id);

    void deleteClient(int id);
}
