package ma.macnss.entities;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Client {
    @Id
    private String matricule;
    @Basic
    private String nom;
    @Basic
    private String prenom;
    @Basic
    private String email;
    @Basic
    private String password;
    @OneToMany(mappedBy = "matriculeClient")
    private Collection<Dossier> dossiersByMatricule;

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Dossier> getDossiersByMatricule() {
        return dossiersByMatricule;
    }

    public void setDossiersByMatricule(Collection<Dossier> dossiersByMatricule) {
        this.dossiersByMatricule = dossiersByMatricule;
    }
}
