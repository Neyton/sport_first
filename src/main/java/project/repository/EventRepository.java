package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.entity.Event;


public interface EventRepository extends JpaRepository<Event, Integer> {
}
