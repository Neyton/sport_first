package by.dreamteam.sportfirst.service.Impl;

import by.dreamteam.sportfirst.entity.EventsEntity;
import by.dreamteam.sportfirst.repository.EventRepository;
import by.dreamteam.sportfirst.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;

    @Autowired
    public EventServiceImpl(@Qualifier("eventRepository") EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

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
