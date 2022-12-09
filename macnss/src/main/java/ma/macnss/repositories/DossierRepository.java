package ma.macnss.repositories;

import ma.macnss.entities.Dossier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DossierRepository extends JpaRepository<Dossier,String> {
}
