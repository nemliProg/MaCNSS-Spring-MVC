package ma.macnss.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Ordonnance {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Basic
    private String typeMedecin;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Dossier CodeDossier;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeMedecin() {
        return typeMedecin;
    }

    public void setTypeMedecin(String typeMedecin) {
        this.typeMedecin = typeMedecin;
    }

    public Dossier getCodeDossier() {
        return CodeDossier;
    }

    public void setCodeDossier(Dossier codeDossier) {
        CodeDossier = codeDossier;
    }
}
