package by.dreamteam.sportfirst.service;


import by.dreamteam.sportfirst.entity.BetsEntity;

public interface BetService {

    void addBet(BetsEntity bet);
    BetsEntity getBetById(int id);

}
