package by.dreamteam.sportfirst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import by.dreamteam.sportfirst.entity.EventsEntity;

@Repository ("eventRepository")
public interface EventRepository extends JpaRepository<EventsEntity, Integer> {
}
