package by.dreamteam.sportfirst.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import by.dreamteam.sportfirst.entity.BetsEntity;
import by.dreamteam.sportfirst.repository.BetRepository;
import by.dreamteam.sportfirst.service.BetService;


@Service
@Transactional
public class BetServiceImpl implements BetService {

    @Autowired
    BetRepository betRepository;

    @Override
    public void addBet(BetsEntity bet) {
        betRepository.saveAndFlush(bet);
    }

    @Override
    public BetsEntity getBetById(int id) {
        return betRepository.findOne(id);
    }
}
