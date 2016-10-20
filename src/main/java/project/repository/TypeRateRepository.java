package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.entity.TypeRateEntity;

@Repository
public interface TypeRateRepository extends JpaRepository<TypeRateEntity, Integer> {
}
