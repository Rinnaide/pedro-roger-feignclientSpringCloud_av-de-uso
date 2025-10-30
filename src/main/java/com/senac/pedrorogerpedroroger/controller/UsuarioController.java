package com.senac.pedrorogerpedroroger.controller;

import com.senac.pedrorogerpedroroger.Entity.Pedido;
import com.senac.pedrorogerpedroroger.Entity.Usuario;
import com.senac.pedrorogerpedroroger.dto.UsuarioDTO;
import com.senac.pedrorogerpedroroger.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/usuario")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/listar")
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }



    @PostMapping("/cadastrar")
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioService.cadastrarUsuario(usuarioDTO);
        return ResponseEntity.ok(usuario);
    }

    @GetMapping("/listar/{usuarioId}")
    public List<Pedido> buscarPedidosPorUsuario(@PathVariable int usuarioId) {
        List<Pedido> pedidos = usuarioService.buscarPedidosPorUsuario(usuarioId);
        return pedidos;
    }
}
