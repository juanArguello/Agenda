/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.DataBase;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "vacunas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vacunas.findAll", query = "SELECT v FROM Vacunas v")
    , @NamedQuery(name = "Vacunas.findById", query = "SELECT v FROM Vacunas v WHERE v.id = :id")
    , @NamedQuery(name = "Vacunas.findByNombreVacuna", query = "SELECT v FROM Vacunas v WHERE v.nombreVacuna = :nombreVacuna")
    , @NamedQuery(name = "Vacunas.findByDosis", query = "SELECT v FROM Vacunas v WHERE v.dosis = :dosis")
    , @NamedQuery(name = "Vacunas.findByFecha", query = "SELECT v FROM Vacunas v WHERE v.fecha = :fecha")
    , @NamedQuery(name = "Vacunas.findByObservacion", query = "SELECT v FROM Vacunas v WHERE v.observacion = :observacion")
    , @NamedQuery(name = "Vacunas.findByAplicada", query = "SELECT v FROM Vacunas v WHERE v.aplicada = :aplicada")})
public class Vacunas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre_vacuna")
    private String nombreVacuna;
    @Column(name = "dosis")
    private Integer dosis;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "observacion")
    private String observacion;
    @Column(name = "aplicada")
    private Character aplicada;
    @OneToMany(mappedBy = "idVacuna")
    private Collection<Hijos> hijosCollection;
    @JoinColumn(name = "id_hijo", referencedColumnName = "id")
    @ManyToOne
    private Hijos idHijo;

    public Vacunas() {
    }

    public Vacunas(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    public Integer getDosis() {
        return dosis;
    }

    public void setDosis(Integer dosis) {
        this.dosis = dosis;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Character getAplicada() {
        return aplicada;
    }

    public void setAplicada(Character aplicada) {
        this.aplicada = aplicada;
    }

    @XmlTransient
    public Collection<Hijos> getHijosCollection() {
        return hijosCollection;
    }

    public void setHijosCollection(Collection<Hijos> hijosCollection) {
        this.hijosCollection = hijosCollection;
    }

    public Hijos getIdHijo() {
        return idHijo;
    }

    public void setIdHijo(Hijos idHijo) {
        this.idHijo = idHijo;
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
        if (!(object instanceof Vacunas)) {
            return false;
        }
        Vacunas other = (Vacunas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ws.DataBase.Vacunas[ id=" + id + " ]";
    }
    
}
