package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.entity.EventsEntity;

@Repository
public interface EventRepository extends JpaRepository<EventsEntity, Integer> {
}
