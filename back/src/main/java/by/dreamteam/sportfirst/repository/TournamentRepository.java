package by.dreamteam.sportfirst.repository;


import by.dreamteam.sportfirst.entity.TournamentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TournamentRepository extends JpaRepository<TournamentEntity, Integer> {

    TournamentEntity findByName(String name);
}
