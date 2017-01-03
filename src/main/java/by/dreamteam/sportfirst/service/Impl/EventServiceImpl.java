package by.dreamteam.sportfirst.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import by.dreamteam.sportfirst.entity.EventsEntity;
import by.dreamteam.sportfirst.repository.EventRepository;
import by.dreamteam.sportfirst.service.EventService;

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
