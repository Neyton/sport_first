package by.dreamteam.sportfirst.repository;


import by.dreamteam.sportfirst.entity.TournamentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigaRepository extends JpaRepository<TournamentEntity, Integer>{
}
