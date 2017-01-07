package by.dreamteam.sportfirst.repository;

import by.dreamteam.sportfirst.entity.BetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BetRepository extends JpaRepository<BetEntity, Integer> {
}
