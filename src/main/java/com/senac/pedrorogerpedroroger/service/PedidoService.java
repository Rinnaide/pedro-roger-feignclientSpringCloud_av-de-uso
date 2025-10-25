package com.senac.pedrorogerpedroroger.service;

import com.senac.pedrorogerpedroroger.client.UsuarioClient;
import com.senac.pedrorogerpedroroger.dto.PedidoDTO;
import com.senac.pedrorogerpedroroger.dto.UsuarioDTO;
import com.senac.pedrorogerpedroroger.entity.Pedido;
import com.senac.pedrorogerpedroroger.entity.Usuario;
import com.senac.pedrorogerpedroroger.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private UsuarioClient usuarioClient;

    public Pedido criarPedido(PedidoDTO pedidoDTO) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setUsuarioNome("Nome do Usuário");
        usuarioDTO.setUsuarioCpf("12345678901");
        usuarioDTO.setUsuarioStatus(1);
        UsuarioDTO usuarioCadastrado = usuarioClient.cadastrarUsuario(usuarioDTO);

        Usuario usuario = new Usuario();
        usuario.setUsuarioId(pedidoDTO.getUsuarioId());

        Pedido pedido = new Pedido();
        pedido.setPedidoData(LocalDate.now());
        pedido.setPedidoValorTotal(pedidoDTO.getPedidoValorTotal());
        pedido.setPedidoStatus(pedidoDTO.getPedidoStatus());
        pedido.setUsuario(usuario);

        return pedidoRepository.save(pedido);
    }

    public List<Pedido> visualizarPedidosPorUsuario(Long usuarioId) {
        return pedidoRepository.findByUsuarioUsuarioId(usuarioId);
    }
}
