package ma.macnss.repositories;

import ma.macnss.entities.Medicament;
import ma.macnss.entities.Ordonnance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PrescriptionRepository extends JpaRepository<Ordonnance,Long> {

    @Query(value = "SELECT O.typeMedecin FROM Ordonnance O WHERE O.CodeDossier.code like :code")
    List<String> findOrdonnanceTypeMedecinByCodeDossier(@Param("code") String code);
}
