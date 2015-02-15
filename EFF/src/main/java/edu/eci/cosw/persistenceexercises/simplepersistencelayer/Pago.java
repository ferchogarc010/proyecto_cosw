package edu.eci.cosw.persistenceexercises.simplepersistencelayer;
// Generated Feb 15, 2015 4:44:56 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pago generated by hbm2java
 */
@Entity
@Table(name="Pagos")
public class Pago  implements java.io.Serializable {


     private Integer idPagos;
     private MetodoDePago metodosDePago;
     private Pedido pedidos;
     private Date fechaPago;
     private float monto;

    public Pago() {
    }

    public Pago(MetodoDePago metodosDePago, Pedido pedidos, Date fechaPago, float monto) {
       this.metodosDePago = metodosDePago;
       this.pedidos = pedidos;
       this.fechaPago = fechaPago;
       this.monto = monto;
    }
   
    @Id @GeneratedValue(strategy=IDENTITY)
    @Column(name="idPagos", unique=true, nullable=false)
    public Integer getIdPagos() {
        return this.idPagos;
    }
    
    public void setIdPagos(Integer idPagos) {
        this.idPagos = idPagos;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MetodosDePago_idMetodosDePago", nullable=false)
    public MetodoDePago getMetodosDePago() {
        return this.metodosDePago;
    }
    
    public void setMetodosDePago(MetodoDePago metodosDePago) {
        this.metodosDePago = metodosDePago;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Pedidos_idPedidos", nullable=false)
    public Pedido getPedidos() {
        return this.pedidos;
    }
    
    public void setPedidos(Pedido pedidos) {
        this.pedidos = pedidos;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha_pago", nullable=false, length=19)
    public Date getFechaPago() {
        return this.fechaPago;
    }
    
    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    
    @Column(name="monto", nullable=false, precision=12, scale=0)
    public float getMonto() {
        return this.monto;
    }
    
    public void setMonto(float monto) {
        this.monto = monto;
    }




}

