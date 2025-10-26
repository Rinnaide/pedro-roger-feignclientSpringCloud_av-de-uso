package com.senac.pedrorogerpedroroger.client;

import com.senac.pedrorogerpedroroger.dto.UsuarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "usuario-service", url = "http://192.168.0.180:8080")
public interface UsuarioClient {

    @PostMapping("/api/usuario/cadastrar")
    UsuarioDTO cadastrarUsuario(@RequestBody UsuarioDTO usuarioDTO);
}
