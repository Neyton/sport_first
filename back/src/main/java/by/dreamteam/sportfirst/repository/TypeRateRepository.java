package by.dreamteam.sportfirst.repository;

import by.dreamteam.sportfirst.entity.TypeRateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRateRepository extends JpaRepository<TypeRateEntity, Integer> {
}
