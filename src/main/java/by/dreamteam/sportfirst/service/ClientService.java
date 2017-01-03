package by.dreamteam.sportfirst.service;

import by.dreamteam.sportfirst.entity.ClientsEntity;

import java.util.List;

public interface ClientService {

    ClientsEntity addClient(ClientsEntity client);
    void deleteClient(int id);
    ClientsEntity getById(int id);
    ClientsEntity editClient(ClientsEntity client);
    List<ClientsEntity> getAll();
    ClientsEntity getClientByName(String login);
}
