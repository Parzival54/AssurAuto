package entite;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author merguez
 */
public class Contrat implements Serializable {

    private Long id;
    private Double tarif;
    private Boolean actif;
    private java.sql.Timestamp dateCreation;
    private Vehicule vehicule;
    private Formule formule;
    private Utilisation utilisation;
    private Utilisateur utilisateur;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTarif() {
        return this.tarif;
    }

    public void setTarif(Double tarif) {
        this.tarif = tarif;
    }

    public Boolean isActif() {
        return this.actif;
    }

    public void setActif(Boolean actif) {
        this.actif = actif;
    }

    public Timestamp getDateCreation() {
        return this.dateCreation;
    }

    public void setDateCreation(Timestamp dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Vehicule getVehicule() {
        return this.vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public Formule getFormule() {
        return this.formule;
    }

    public void setFormule(Formule formule) {
        this.formule = formule;
    }

    public Utilisation getUtilisation() {
        return this.utilisation;
    }

    public void setUtilisation(Utilisation utilisation) {
        this.utilisation = utilisation;
    }

    public Utilisateur getUtilisateur() {
        return this.utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

}
