package by.dreamteam.sportfirst.repository;

import by.dreamteam.sportfirst.entity.RateEventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RateEventRepository extends JpaRepository<RateEventEntity, Integer> {

    List<RateEventEntity> findByEventIdEvent(int id);
}
