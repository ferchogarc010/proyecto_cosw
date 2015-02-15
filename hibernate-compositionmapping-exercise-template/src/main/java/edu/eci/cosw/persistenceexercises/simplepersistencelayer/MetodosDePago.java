package edu.eci.cosw.persistenceexercises.simplepersistencelayer;
// Generated Feb 15, 2015 1:34:13 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * MetodosDePago generated by hbm2java
 */
@Entity
@Table(name="MetodosDePago"
    ,catalog="coswg1"
)
public class MetodosDePago  implements java.io.Serializable {


     private int idMetodosDePago;
     private String nombre;
     private Set pagoses = new HashSet(0);

    public MetodosDePago() {
    }

	
    public MetodosDePago(int idMetodosDePago) {
        this.idMetodosDePago = idMetodosDePago;
    }
    public MetodosDePago(int idMetodosDePago, String nombre, Set pagoses) {
       this.idMetodosDePago = idMetodosDePago;
       this.nombre = nombre;
       this.pagoses = pagoses;
    }
   
     @Id 

    
    @Column(name="idMetodosDePago", unique=true, nullable=false)
    public int getIdMetodosDePago() {
        return this.idMetodosDePago;
    }
    
    public void setIdMetodosDePago(int idMetodosDePago) {
        this.idMetodosDePago = idMetodosDePago;
    }

    
    @Column(name="nombre", length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="metodosDePago")
    public Set getPagoses() {
        return this.pagoses;
    }
    
    public void setPagoses(Set pagoses) {
        this.pagoses = pagoses;
    }




}

