package ma.macnss.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Medicament {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Basic
    private String code;

    @ManyToOne
    @JoinColumn( nullable = false)
    private Dossier CodeDossier;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Dossier getCodeDossier() {
        return CodeDossier;
    }

    public void setCodeDossier(Dossier codeDossier) {
        CodeDossier = codeDossier;
    }
}
