package entite;

import java.io.Serializable;
import javax.validation.constraints.Size;

/**
 * @author merguez
 */
public class Formule implements Serializable {

    private Long id;
    @Size(max = 45)
    private String libelle;
    private Double coefficient;

    public Double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Double coefficient) {
        this.coefficient = coefficient;
    }

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
