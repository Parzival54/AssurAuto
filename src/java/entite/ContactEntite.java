/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author merguez
 */
@Entity
@Table(name = "contact")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ContactEntite.findAll", query = "SELECT c FROM ContactEntite c")
    , @NamedQuery(name = "ContactEntite.findById", query = "SELECT c FROM ContactEntite c WHERE c.id = :id")
    , @NamedQuery(name = "ContactEntite.findByTypeDemande", query = "SELECT c FROM ContactEntite c WHERE c.typeDemande = :typeDemande")
    , @NamedQuery(name = "ContactEntite.findByDemande", query = "SELECT c FROM ContactEntite c WHERE c.demande = :demande")})
public class ContactEntite implements Serializable {

    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "email")
    private String email;
    @Size(max = 45)
    @Column(name = "login")
    private String login;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "typeDemande")
    private int typeDemande;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "demande")
    private String demande;
    @JoinColumn(name = "userid", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private UtilisateurEntite userid;

    public ContactEntite() {
    }

    public ContactEntite(Integer id) {
        this.id = id;
    }

    public ContactEntite(Integer id, int typeDemande, String demande) {
        this.id = id;
        this.typeDemande = typeDemande;
        this.demande = demande;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTypeDemande() {
        return typeDemande;
    }

    public void setTypeDemande(int typeDemande) {
        this.typeDemande = typeDemande;
    }

    public String getDemande() {
        return demande;
    }

    public void setDemande(String demande) {
        this.demande = demande;
    }

    public UtilisateurEntite getUserid() {
        return userid;
    }

    public void setUserid(UtilisateurEntite userid) {
        this.userid = userid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactEntite)) {
            return false;
        }
        ContactEntite other = (ContactEntite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.ContactEntite[ id=" + id + " ]";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
}
