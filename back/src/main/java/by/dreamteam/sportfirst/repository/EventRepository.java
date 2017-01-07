package by.dreamteam.sportfirst.repository;

import by.dreamteam.sportfirst.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository ("eventRepository")
public interface EventRepository extends JpaRepository<EventEntity, Integer> {
}
