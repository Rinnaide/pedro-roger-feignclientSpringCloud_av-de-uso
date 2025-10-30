package com.senac.pedrorogerpedroroger.controller;

import com.senac.pedrorogerpedroroger.dto.PedidoDTO;
import com.senac.pedrorogerpedroroger.entity.Pedido;
import com.senac.pedrorogerpedroroger.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedido")
@CrossOrigin("*")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping("/criar")
    public ResponseEntity<Pedido> criarPedido(@RequestBody PedidoDTO pedidoDTO) {
        Pedido pedido = pedidoService.criarPedido(pedidoDTO);
        return ResponseEntity.ok(pedido);
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<PedidoDTO> buscarPedidoPorUsuario(@PathVariable int usuarioId){
        return pedidoService.buscarPedidoPorUsuario(usuarioId);
    }

}
