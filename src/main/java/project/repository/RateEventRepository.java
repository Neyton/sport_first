package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.entity.RateEvent;


public interface RateEventRepository extends JpaRepository<RateEvent, Integer> {
}
