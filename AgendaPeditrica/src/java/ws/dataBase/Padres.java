/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.dataBase;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
 * @author user
 */
@Entity
@Table(name = "padres")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Padres.findAll", query = "SELECT p FROM Padres p"),
    @NamedQuery(name = "Padres.findById", query = "SELECT p FROM Padres p WHERE p.id = :id"),
    @NamedQuery(name = "Padres.findByCedula", query = "SELECT p FROM Padres p WHERE p.cedula = :cedula"),
    @NamedQuery(name = "Padres.findByNombre", query = "SELECT p FROM Padres p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Padres.findByApellido", query = "SELECT p FROM Padres p WHERE p.apellido = :apellido"),
    @NamedQuery(name = "Padres.findByEdad", query = "SELECT p FROM Padres p WHERE p.edad = :edad"),
    @NamedQuery(name = "Padres.findByDireccion", query = "SELECT p FROM Padres p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "Padres.findByTelefono", query = "SELECT p FROM Padres p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "Padres.findByCorreoElectronico", query = "SELECT p FROM Padres p WHERE p.correoElectronico = :correoElectronico")})
public class Padres implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cedula")
    private int cedula;
    @Size(max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 30)
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "edad")
    private Integer edad;
    @Size(max = 30)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 10)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 30)
    @Column(name = "correo_electronico")
    private String correoElectronico;
    @OneToMany(mappedBy = "idPadre")
    private Collection<Hijos> hijosCollection;

    public Padres() {
    }

    public Padres(Integer id) {
        this.id = id;
    }

    public Padres(Integer id, int cedula) {
        this.id = id;
        this.cedula = cedula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @XmlTransient
    public Collection<Hijos> getHijosCollection() {
        return hijosCollection;
    }

    public void setHijosCollection(Collection<Hijos> hijosCollection) {
        this.hijosCollection = hijosCollection;
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
        if (!(object instanceof Padres)) {
            return false;
        }
        Padres other = (Padres) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ws.dataBase.Padres[ id=" + id + " ]";
    }
    
}
