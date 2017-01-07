package by.dreamteam.sportfirst.service.Impl;


import by.dreamteam.sportfirst.entity.BetEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import by.dreamteam.sportfirst.repository.BetRepository;
import by.dreamteam.sportfirst.service.BetService;


@Service
@Transactional
public class BetServiceImpl implements BetService {

    @Autowired
    BetRepository betRepository;

    @Override
    public void addBet(BetEntity bet) {
        betRepository.saveAndFlush(bet);
    }

    @Override
    public BetEntity getBetById(int id) {
        return betRepository.findOne(id);
    }
}
