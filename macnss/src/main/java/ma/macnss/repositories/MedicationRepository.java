package ma.macnss.repositories;

import ma.macnss.entities.Dossier;
import ma.macnss.entities.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface MedicationRepository extends JpaRepository<Medicament,Long> {

    @Query(value = "SELECT M.code FROM Medicament M WHERE M.CodeDossier.code like :code")
    List<String> findMedicamentsCodeByCodeDossier(@Param("code") String code);
}
