package com.senac.pedrorogerpedroroger.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pedidoId;

    private LocalDate pedidoData;
    private BigDecimal pedidoValorTotal;
    private Integer pedidoStatus;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Pedido() {}

    public Pedido(LocalDate pedidoData, BigDecimal pedidoValorTotal, Integer pedidoStatus, Usuario usuario) {
        this.pedidoData = pedidoData;
        this.pedidoValorTotal = pedidoValorTotal;
        this.pedidoStatus = pedidoStatus;
        this.usuario = usuario;
    }

    public Long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public LocalDate getPedidoData() {
        return pedidoData;
    }

    public void setPedidoData(LocalDate pedidoData) {
        this.pedidoData = pedidoData;
    }

    public BigDecimal getPedidoValorTotal() {
        return pedidoValorTotal;
    }

    public void setPedidoValorTotal(BigDecimal pedidoValorTotal) {
        this.pedidoValorTotal = pedidoValorTotal;
    }

    public Integer getPedidoStatus() {
        return pedidoStatus;
    }

    public void setPedidoStatus(Integer pedidoStatus) {
        this.pedidoStatus = pedidoStatus;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
