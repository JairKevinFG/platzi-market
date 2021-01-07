package com.platzi.market.persistence.entity;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

import javax.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="compras_productos")
public class ComprasProducto {
    @EmbeddedId
    private ComprasProductoPK id;

    private Integer cantidad;
    private BigDecimal total;
    private Boolean estado;

    @ManyToMany
    @JoinColumn(name = "id_compra", insertable = false , updatable = false)
    private Compra compra;
    @ManyToMany
    @JoinColumn(name ="id_producto", insertable = false, updatable = false)
    private Producto producto;


    public ComprasProductoPK getId() {
        return id;
    }

    public void setId(ComprasProductoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
