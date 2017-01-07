package by.dreamteam.sportfirst.service;

import by.dreamteam.sportfirst.entity.ClientEntity;

import java.util.List;

public interface ClientService {

    ClientEntity addClient(ClientEntity client);
    void deleteClient(int id);
    ClientEntity getById(int id);
    ClientEntity editClient(ClientEntity client);
    List<ClientEntity> getAll();
    ClientEntity getClientByName(String login);
}
