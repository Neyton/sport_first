package by.dreamteam.sportfirst.service;


import by.dreamteam.sportfirst.entity.RateEventEntity;

import java.util.List;

public interface RateEventService {

    void addRate(RateEventEntity rate);
    void deleteRate(RateEventEntity rate);
    RateEventEntity getRateById(int id);
    RateEventEntity editRate(RateEventEntity rate);
    List<RateEventEntity> getAll();
    List<RateEventEntity> findByEventEntityId(int id);
}
