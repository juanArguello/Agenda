/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.DataBase;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "hijos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hijos.findAll", query = "SELECT h FROM Hijos h")
    , @NamedQuery(name = "Hijos.findById", query = "SELECT h FROM Hijos h WHERE h.id = :id")
    , @NamedQuery(name = "Hijos.findByCedula", query = "SELECT h FROM Hijos h WHERE h.cedula = :cedula")
    , @NamedQuery(name = "Hijos.findByNombre", query = "SELECT h FROM Hijos h WHERE h.nombre = :nombre")
    , @NamedQuery(name = "Hijos.findByApellido", query = "SELECT h FROM Hijos h WHERE h.apellido = :apellido")
    , @NamedQuery(name = "Hijos.findByFechaNacimiento", query = "SELECT h FROM Hijos h WHERE h.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "Hijos.findByLugarNacimiento", query = "SELECT h FROM Hijos h WHERE h.lugarNacimiento = :lugarNacimiento")
    , @NamedQuery(name = "Hijos.findByEdad", query = "SELECT h FROM Hijos h WHERE h.edad = :edad")
    , @NamedQuery(name = "Hijos.findBySexo", query = "SELECT h FROM Hijos h WHERE h.sexo = :sexo")
    , @NamedQuery(name = "Hijos.findByPeso", query = "SELECT h FROM Hijos h WHERE h.peso = :peso")
    , @NamedQuery(name = "Hijos.findByTalla", query = "SELECT h FROM Hijos h WHERE h.talla = :talla")
    , @NamedQuery(name = "Hijos.findByObservaciones", query = "SELECT h FROM Hijos h WHERE h.observaciones = :observaciones")})
public class Hijos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "cedula")
    private Integer cedula;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Column(name = "lugar_nacimiento")
    private String lugarNacimiento;
    @Column(name = "edad")
    private Integer edad;
    @Column(name = "sexo")
    private Character sexo;
    @Column(name = "peso")
    private BigInteger peso;
    @Column(name = "talla")
    private BigInteger talla;
    @Column(name = "observaciones")
    private String observaciones;
    @JoinColumn(name = "id_padre", referencedColumnName = "id")
    @ManyToOne
    private Padres idPadre;
    @JoinColumn(name = "id_vacuna", referencedColumnName = "id")
    @ManyToOne
    private Vacunas idVacuna;
    @OneToMany(mappedBy = "idHijo")
    private Collection<Vacunas> vacunasCollection;

    public Hijos() {
    }

    public Hijos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public BigInteger getPeso() {
        return peso;
    }

    public void setPeso(BigInteger peso) {
        this.peso = peso;
    }

    public BigInteger getTalla() {
        return talla;
    }

    public void setTalla(BigInteger talla) {
        this.talla = talla;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Padres getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(Padres idPadre) {
        this.idPadre = idPadre;
    }

    public Vacunas getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(Vacunas idVacuna) {
        this.idVacuna = idVacuna;
    }

    @XmlTransient
    public Collection<Vacunas> getVacunasCollection() {
        return vacunasCollection;
    }

    public void setVacunasCollection(Collection<Vacunas> vacunasCollection) {
        this.vacunasCollection = vacunasCollection;
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
        if (!(object instanceof Hijos)) {
            return false;
        }
        Hijos other = (Hijos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ws.DataBase.Hijos[ id=" + id + " ]";
    }
    
}
