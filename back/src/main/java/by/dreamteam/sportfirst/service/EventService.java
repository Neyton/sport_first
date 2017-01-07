package by.dreamteam.sportfirst.service;


import by.dreamteam.sportfirst.entity.EventEntity;

import java.util.List;

public interface EventService  {

    void addEvent(EventEntity event);
    void deleteEvent(EventEntity event);
    EventEntity getEventById(int id);
    List<EventEntity> getAll();
}
