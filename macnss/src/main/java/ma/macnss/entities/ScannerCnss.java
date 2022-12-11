package ma.macnss.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class ScannerCnss {
    @Id
    private String code;
    @Basic
    private String nomCommercial;
    @Basic
    private double prixRembourcement;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNomCommercial() {
        return nomCommercial;
    }

    public void setNomCommercial(String nomCommercial) {
        this.nomCommercial = nomCommercial;
    }

    public double getPrixRembourcement() {
        return prixRembourcement;
    }

    public void setPrixRembourcement(double prixRembourcement) {
        this.prixRembourcement = prixRembourcement;
    }

}
