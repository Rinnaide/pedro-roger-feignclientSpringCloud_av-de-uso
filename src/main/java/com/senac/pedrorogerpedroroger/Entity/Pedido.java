package com.senac.pedrorogerpedroroger.Entity;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pedido_id")
    private Long pedidoId;

    @Column(name="pedido_data")
    private LocalDate pedidoData;

    @Column(name="pedido_valor_total")
    private BigDecimal pedidoValorTotal;
    @Column(name="pedido_status")
    private Integer pedidoStatus;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

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