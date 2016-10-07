package project.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import project.entity.Bet;
import project.repository.BetRepository;
import project.service.BetService;

public class BetServiceImpl implements BetService {

    @Autowired
    BetRepository betRepository;

    @Override
    public void addBet(Bet bet) {
        betRepository.saveAndFlush(bet);
    }

    @Override
    public Bet getBetById(int id) {
        return betRepository.findOne(id);
    }
}
