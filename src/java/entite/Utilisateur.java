package entite;

import java.io.Serializable;
import javax.validation.constraints.Size;

/**
 * @author merguez
 */
public class Utilisateur implements Serializable {

    private Long id;
    @Size(min = 3, max = 20, message = "3 caractères min et 20 caractères max")
    private String login;
    @Size(max = 40)
    private String password;
    private String email;
    @Size(max = 45)
    private String nom;
    @Size(max = 45)
    private String prenom;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

}
