package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.entity.Bet;


public interface BetRepository extends JpaRepository<Bet, Integer> {
}
