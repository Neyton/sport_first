package by.dreamteam.sportfirst.repository;


import by.dreamteam.sportfirst.entity.ClientsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientsEntity, Integer> {

}
