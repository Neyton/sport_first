package project.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.entity.Client;
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
    public Client addClient(Client client) {
        return clientRepository.saveAndFlush(client);
    }

    @Override
    public void deleteClient(int id) {
        clientRepository.delete(id);
    }

    @Override
    public Client getById(int id) {
        return clientRepository.findOne(id);
    }

    @Override
    public Client editClient(Client client) {
        return clientRepository.saveAndFlush(client);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }
}
