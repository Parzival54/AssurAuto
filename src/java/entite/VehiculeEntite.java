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
import javax.persistence.Id;
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
@Entity(name = "vehicule")
@Table(name = "vehicule")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "vehicule.findAll", query = "SELECT v FROM vehicule v")
    , @NamedQuery(name = "vehicule.findById", query = "SELECT v FROM vehicule v WHERE v.id = :id")
    , @NamedQuery(name = "vehicule.findByMarque", query = "SELECT v FROM vehicule v WHERE v.marque = :marque")
    , @NamedQuery(name = "vehicule.findByModele", query = "SELECT v FROM vehicule v WHERE v.modele = :modele")
    , @NamedQuery(name = "vehicule.findByVersion", query = "SELECT v FROM vehicule v WHERE v.version = :version")
    , @NamedQuery(name = "vehicule.findByCoefficient", query = "SELECT v FROM vehicule v WHERE v.coefficient = :coefficient")
    , @NamedQuery(name = "vehicule.findAllMarque", query = "SELECT DISTINCT v.marque FROM vehicule v")
    , @NamedQuery(name = "vehicule.findAllModele", query = "SELECT DISTINCT v.modele FROM vehicule v WHERE v.marque = :marque")
    , @NamedQuery(name = "vehicule.findAllVersion", query = "SELECT DISTINCT v.version FROM vehicule v WHERE v.marque = :marque AND v.modele = :modele")})
public class VehiculeEntite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "marque")
    private String marque;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "modele")
    private String modele;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "version")
    private String version;
    @Basic(optional = false)
    @NotNull
    @Column(name = "coefficient")
    private int coefficient;

    public VehiculeEntite() {
    }

    public VehiculeEntite(Integer id) {
        this.id = id;
    }

    public VehiculeEntite(Integer id, String marque, String modele, String version, int coefficient) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.version = version;
        this.coefficient = coefficient;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
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
        if (!(object instanceof VehiculeEntite)) {
            return false;
        }
        VehiculeEntite other = (VehiculeEntite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Vehicule[ id=" + id + " ]";
    }
    
}
