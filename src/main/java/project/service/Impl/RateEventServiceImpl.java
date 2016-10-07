package project.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import project.entity.RateEvent;
import project.repository.RateEventRepository;
import project.service.RateEventService;


public class RateEventServiceImpl implements RateEventService {

    @Autowired
    RateEventRepository rateRepository;

    @Override
    public void addRate(RateEvent rate) {
        rateRepository.saveAndFlush(rate);
    }

    @Override
    public void deleteRate(RateEvent rate) {
        rateRepository.delete(rate);
    }

    @Override
    public RateEvent getRateById(int id) {
        return rateRepository.findOne(id);
    }

    @Override
    public RateEvent editRate(RateEvent rate) {
        return rateRepository.saveAndFlush(rate);
    }
}
