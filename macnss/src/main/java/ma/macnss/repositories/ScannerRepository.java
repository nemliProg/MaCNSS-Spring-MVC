package ma.macnss.repositories;

import ma.macnss.entities.Medicament;
import ma.macnss.entities.Scanner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ScannerRepository extends JpaRepository<Scanner,Long> {

    @Query(value = "SELECT S.code FROM Scanner S WHERE S.CodeDossier.code like :code")
    List<String> findScannerCodeByCodeDossier(@Param("code") String code);
}
