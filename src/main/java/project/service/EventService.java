package project.service;


import project.entity.Event;

import java.util.List;

public interface EventService  {

    void addEvent(Event event);
    void deleteEvent(Event event);
    Event getEventById(int id);
    List<Event> getAll();
}
