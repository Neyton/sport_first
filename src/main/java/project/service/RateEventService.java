package project.service;


import project.entity.RateEvent;


public interface RateEventService {

    void addRate(RateEvent rate);
    void deleteRate(RateEvent rate);
    RateEvent getRateById(int id);
    RateEvent editRate(RateEvent rate);
}
