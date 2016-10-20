package project.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import project.entity.RateEventEntity;

import java.util.List;

@Repository
public interface RateEventRepository extends JpaRepository<RateEventEntity, Integer> {

    List<RateEventEntity> findByEventIdEvent(int id);
}
