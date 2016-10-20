package project.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.events.EventException;
import project.entity.EventsEntity;
import project.repository.EventRepository;
import project.service.EventService;

import java.util.List;

@Service
@Transactional
public class EventServiceImpl implements EventService {

    @Autowired
    EventRepository eventRepository;

    @Override
    public void addEvent(EventsEntity event) {
        eventRepository.saveAndFlush(event);
    }

    @Override
    public void deleteEvent(EventsEntity event) {
        eventRepository.delete(event);
    }

    @Override
    public EventsEntity getEventById(int id) {
        return eventRepository.findOne(id);
    }

    @Override
    public List<EventsEntity> getAll() {
        return eventRepository.findAll();
    }
}
