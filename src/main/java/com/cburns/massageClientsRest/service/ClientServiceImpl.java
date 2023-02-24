package com.cburns.massageClients.service;

import com.cburns.massageClients.dao.ClientDAO;
import com.cburns.massageClients.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientDAO clientDAO;
    @Override
    @Transactional
    public List<Client> getAllClients() {
        return clientDAO.getAllClients();
    }

    @Override
    @Transactional
    public void saveClient(Client client) {
        clientDAO.saveClient(client);
    }

    @Override
    @Transactional
    public Client getClient(int id) {
        return clientDAO.getClient(id);
    }

    @Override
    @Transactional
    public void deleteClient(int id) {
        clientDAO.deleteClient(id);
    }
}
