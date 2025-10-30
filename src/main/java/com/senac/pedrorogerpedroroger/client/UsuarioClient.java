package com.senac.pedrorogerpedroroger.client;

import com.senac.pedrorogerpedroroger.dto.PedidoDTO;
import com.senac.pedrorogerpedroroger.dto.UsuarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "usuario-service", url = "http://localhost:8081", path = "/api/pedido/usuario")
public interface UsuarioClient {


    @GetMapping(value = "/{usuarioId}")
    public ResponseEntity<List<PedidoDTO>> buscarPedidoPorUsuarioId(@PathVariable int usuarioId);

    @PostMapping("/api/usuario/cadastrar")
    UsuarioDTO cadastrarUsuario(@RequestBody UsuarioDTO usuarioDTO);
}
