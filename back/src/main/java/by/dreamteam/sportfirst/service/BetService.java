package by.dreamteam.sportfirst.service;


import by.dreamteam.sportfirst.entity.BetEntity;

public interface BetService {

    void addBet(BetEntity bet);
    BetEntity getBetById(int id);

}
