package ma.macnss.repositories;

import ma.macnss.entities.OrdonnanceCnss;
import ma.macnss.entities.ScannerCnss;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScannerCnssRepository extends JpaRepository<ScannerCnss,String> {
}
