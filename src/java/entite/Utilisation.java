package entite;

import java.io.Serializable;

/**
 * @author merguez
 */
public class Utilisation implements Serializable {

    private Long id;
    private Boolean travail;
    private Kms kms;
    private Frequence frequence;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean isTravail() {
        return this.travail;
    }

    public void setTravail(Boolean travail) {
        this.travail = travail;
    }

    public Kms getKms() {
        return this.kms;
    }

    public void setKms(Kms kms) {
        this.kms = kms;
    }

    public Frequence getFrequence() {
        return this.frequence;
    }

    public void setFrequence(Frequence frequence) {
        this.frequence = frequence;
    }

}
