package entite;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author merguez
 */
public class Vehicule implements Serializable {

    private Long id;

    @Size(max = 45)
    @NotNull
    private String marque;
    @Size(max = 45)
    @NotNull
    private String modele;
    @Size(max = 45)
    private String version;
    @NotNull
    private Double coefficient;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarque() {
        return this.marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return this.modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Double getCoefficient() {
        return this.coefficient;
    }

    public void setCoefficient(Double coefficient) {
        this.coefficient = coefficient;
    }

}
