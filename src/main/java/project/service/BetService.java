package project.service;


import project.entity.BetsEntity;

public interface BetService {

    void addBet(BetsEntity bet);
    BetsEntity getBetById(int id);

}
