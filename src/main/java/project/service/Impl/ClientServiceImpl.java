package project.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.entity.ClientsEntity;
import project.repository.ClientRepository;
import project.service.ClientService;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    @Transactional()
    public ClientsEntity addClient(ClientsEntity client) {
        return clientRepository.saveAndFlush(client);
    }

    @Override
    public void deleteClient(int id) {
        clientRepository.delete(id);
    }

    @Override
    public ClientsEntity getById(int id) {
        return clientRepository.findOne(id);
    }

    @Override
    public ClientsEntity editClient(ClientsEntity client) {
        return clientRepository.saveAndFlush(client);
    }

    @Override
    public List<ClientsEntity> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public ClientsEntity getClientByName(String login) {
        ClientsEntity client = new ClientsEntity();
        client.setLogin("user");
        client.setPassword("user");
        return client;
    }
}
