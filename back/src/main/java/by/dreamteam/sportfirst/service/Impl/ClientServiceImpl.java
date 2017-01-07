package by.dreamteam.sportfirst.service.Impl;


import by.dreamteam.sportfirst.entity.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import by.dreamteam.sportfirst.repository.ClientRepository;
import by.dreamteam.sportfirst.service.ClientService;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    @Transactional()
    public ClientEntity addClient(ClientEntity client) {
        return clientRepository.saveAndFlush(client);
    }

    @Override
    public void deleteClient(int id) {
        clientRepository.delete(id);
    }

    @Override
    public ClientEntity getById(int id) {
        return clientRepository.findOne(id);
    }

    @Override
    public ClientEntity editClient(ClientEntity client) {
        return clientRepository.saveAndFlush(client);
    }

    @Override
    public List<ClientEntity> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public ClientEntity getClientByName(String login) {
        ClientEntity client = new ClientEntity();
        client.setLogin("user");
        client.setPassword("user");
        return client;
    }
}
