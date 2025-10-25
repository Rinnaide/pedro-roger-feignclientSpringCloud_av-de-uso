package com.senac.pedrorogerpedroroger.dto;

import java.math.BigDecimal;

public class PedidoDTO {

    private BigDecimal pedidoValorTotal;
    private Integer pedidoStatus;
    private Long usuarioId;

    public PedidoDTO() {}

    public PedidoDTO(BigDecimal pedidoValorTotal, Integer pedidoStatus, Long usuarioId) {
        this.pedidoValorTotal = pedidoValorTotal;
        this.pedidoStatus = pedidoStatus;
        this.usuarioId = usuarioId;
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

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }
}
