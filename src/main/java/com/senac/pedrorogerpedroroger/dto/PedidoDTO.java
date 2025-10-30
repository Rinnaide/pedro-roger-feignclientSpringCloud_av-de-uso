package com.senac.pedrorogerpedroroger.dto;

import java.math.BigDecimal;

public class PedidoDTO {

    private BigDecimal pedidoValorTotal;
    private Integer pedidoStatus;
    private int usuarioId;



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

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }
}
