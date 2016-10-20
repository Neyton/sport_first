package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.entity.BetsEntity;

@Repository
public interface BetRepository extends JpaRepository<BetsEntity, Integer> {
}
