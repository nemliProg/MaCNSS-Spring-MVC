package ma.macnss.entities;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Dossier {
    @Id
    private String code;
    @Basic
    private String status;
    @Basic
    private String response;
    @Basic
    private String totalPrix;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Client matriculeClient;
    @OneToMany(mappedBy = "CodeDossier")
    private Collection<Medicament> medicamentsByCode;
    @OneToMany(mappedBy = "CodeDossier")
    private Collection<Ordonnance> ordonnancesByCode;
    @OneToMany(mappedBy = "CodeDossier")
    private Collection<Scanner> scannersByCode;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Client getMatriculeClient() {
        return matriculeClient;
    }


    public void setMatriculeClient(Client matriculeClient) {
        this.matriculeClient = matriculeClient;
    }

    public String getTotalPrix() {
        return totalPrix;
    }

    public void setTotalPrix(String totalPrix) {
        this.totalPrix = totalPrix;
    }

    public Collection<Medicament> getMedicamentsByCode() {
        return medicamentsByCode;
    }

    public void setMedicamentsByCode(Collection<Medicament> medicamentsByCode) {
        this.medicamentsByCode = medicamentsByCode;
    }

    public Collection<Ordonnance> getOrdonnancesByCode() {
        return ordonnancesByCode;
    }

    public void setOrdonnancesByCode(Collection<Ordonnance> ordonnancesByCode) {
        this.ordonnancesByCode = ordonnancesByCode;
    }

    public Collection<Scanner> getScannersByCode() {
        return scannersByCode;
    }

    public void setScannersByCode(Collection<Scanner> scannersByCode) {
        this.scannersByCode = scannersByCode;
    }
}
