package entite;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.validation.constraints.NotNull;

/**
 * @author merguez
 */
public class Contact implements Serializable {

    private Long id;
    @NotNull(message = "le message ne doit pas être nul")
    private String demande;
    private String email;
    private String login;
    private Timestamp dateDemande;
    private TypeDemande typeDemande;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDemande() {
        return this.demande;
    }

    public void setDemande(String demande) {
        this.demande = demande;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Timestamp getDateDemande() {
        return this.dateDemande;
    }

    public void setDateDemande(Timestamp dateDemande) {
        this.dateDemande = dateDemande;
    }

    public TypeDemande getTypeDemande() {
        return this.typeDemande;
    }

    public void setTypeDemande(TypeDemande typeDemande) {
        this.typeDemande = typeDemande;
    }

}
