package ma.macnss.repositories;

import ma.macnss.entities.OrdonnanceCnss;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionCnssRepository extends JpaRepository<OrdonnanceCnss,String> {
}
