/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author merguez
 */
@Entity(name = "utilisateur")
@Table(name = "utilisateur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "utilisateur.findAll", query = "SELECT u FROM utilisateur u")
    , @NamedQuery(name = "utilisateur.findById", query = "SELECT u FROM utilisateur u WHERE u.id = :id")
    , @NamedQuery(name = "utilisateur.findByLogin", query = "SELECT u FROM utilisateur u WHERE u.login = :login")
    , @NamedQuery(name = "utilisateur.findByPassword", query = "SELECT u FROM utilisateur u WHERE u.password = :password")})
public class UtilisateurEntite implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userid")
    private List<ContactEntite> contactList;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "password")
    private String password;

    public UtilisateurEntite() {
    }

    public UtilisateurEntite(Integer id) {
        this.id = id;
    }

    public UtilisateurEntite(Integer id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        if (!(object instanceof UtilisateurEntite)) {
            return false;
        }
        UtilisateurEntite other = (UtilisateurEntite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Utilisateur[ id=" + id + " ]";
    }

    @XmlTransient
    public List<ContactEntite> getContactList() {
        return contactList;
    }

    public void setContactList(List<ContactEntite> contactList) {
        this.contactList = contactList;
    }
    
}
