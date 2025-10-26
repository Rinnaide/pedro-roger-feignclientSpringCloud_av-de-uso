package com.senac.pedrorogerpedroroger.client;

import com.senac.pedrorogerpedroroger.dto.PedidoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "pedido-service", url = "http://localhost:8080")
public interface PedidoClient {

    @PostMapping("/api/pedido/usuario/{usuarioId}")
    PedidoDTO buscarPedido(@PathVariable Long usuarioId);


}