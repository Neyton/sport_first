package project.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import project.entity.Event;
import project.repository.EventRepository;
import project.service.EventService;

import java.util.List;


public class EventServiceImpl implements EventService {

    @Autowired
    EventRepository eventRepository;

    @Override
    public void addEvent(Event event) {
        eventRepository.saveAndFlush(event);
    }

    @Override
    public void deleteEvent(Event event) {
        eventRepository.delete(event);
    }

    @Override
    public Event getEventById(int id) {
        return eventRepository.getOne(id);
    }

    @Override
    public List<Event> getAll() {
        return eventRepository.findAll();
    }
}
