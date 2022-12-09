package ma.macnss.repositories;

import ma.macnss.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client,String> {

    Optional<Client> findClientByMatricule(String matricule);
    Optional<Client> findByEmail(String email);
}
