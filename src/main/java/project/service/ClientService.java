package project.service;

import project.entity.Client;

import java.util.List;

public interface ClientService {

    Client addClient(Client client);
    void deleteClient(int id);
    Client getById(int id);
    Client editClient(Client client);
    List<Client> getAll();
}
