package entite;

import java.io.Serializable;

/**
 * @author merguez
 */
public class Frequence implements Serializable {

    private Long id;
    private String libelle;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

}
