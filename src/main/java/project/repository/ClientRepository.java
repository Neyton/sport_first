package project.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.entity.ClientsEntity;

@Repository
public interface ClientRepository extends JpaRepository<ClientsEntity, Integer> {

}
