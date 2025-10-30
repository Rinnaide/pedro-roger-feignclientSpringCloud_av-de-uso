package com.senac.pedrorogerpedroroger.client;

import com.senac.pedrorogerpedroroger.Entity.Pedido;
import com.senac.pedrorogerpedroroger.dto.PedidoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "pedido-service", url = "http://localhost:8081", path = "/api/pedido/usuario")
public interface PedidoClient {

    @GetMapping(value = "/{usuarioId}")
    public ResponseEntity<List<Pedido>> buscarPedidoPorUsuarioId(@PathVariable int usuarioId);


}