package project.service;


import project.entity.Bet;

public interface BetService {

    void addBet(Bet bet);
    Bet getBetById(int id);

}
