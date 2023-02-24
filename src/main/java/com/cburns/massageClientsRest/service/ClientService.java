package com.cburns.massageClients.service;

import com.cburns.massageClients.entity.Client;

import java.util.List;

public interface ClientService {
    List<Client> getAllClients();
    void saveClient(Client client);
    Client getClient(int id);
    void deleteClient(int id);
}
