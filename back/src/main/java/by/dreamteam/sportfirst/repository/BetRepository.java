package by.dreamteam.sportfirst.repository;

import by.dreamteam.sportfirst.entity.BetsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BetRepository extends JpaRepository<BetsEntity, Integer> {
}
