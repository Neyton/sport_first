package by.dreamteam.sportfirst.repository;


import by.dreamteam.sportfirst.entity.Liga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigaRepository extends JpaRepository<Liga, Integer>{
}
