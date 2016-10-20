package project.service;


import project.entity.EventsEntity;

import java.util.List;

public interface EventService  {

    void addEvent(EventsEntity event);
    void deleteEvent(EventsEntity event);
    EventsEntity getEventById(int id);
    List<EventsEntity> getAll();
}
