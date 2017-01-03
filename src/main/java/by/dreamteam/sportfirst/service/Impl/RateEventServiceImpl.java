package by.dreamteam.sportfirst.service.Impl;

import by.dreamteam.sportfirst.entity.RateEventEntity;
import by.dreamteam.sportfirst.service.RateEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import by.dreamteam.sportfirst.repository.RateEventRepository;

import java.util.List;

@Service
@Transactional
public class RateEventServiceImpl implements RateEventService {

    @Autowired
    RateEventRepository rateRepository;

    @Override
    public void addRate(RateEventEntity rate) {
        rateRepository.saveAndFlush(rate);
    }

    @Override
    public void deleteRate(RateEventEntity rate) {
        rateRepository.delete(rate);
    }

    @Override
    public RateEventEntity getRateById(int id) {
        return rateRepository.findOne(id);
    }

    @Override
    public RateEventEntity editRate(RateEventEntity rate) {

        return rateRepository.saveAndFlush(rate);
    }

    @Override
    public List<RateEventEntity> getAll() {
        return rateRepository.findAll();
    }

    @Override
    public List<RateEventEntity> findByEventEntityId(int id) {
        return rateRepository.findByEventIdEvent(id);
    }


}
