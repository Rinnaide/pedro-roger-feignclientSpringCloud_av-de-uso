package com.senac.pedrorogerpedroroger.service;

import com.senac.pedrorogerpedroroger.client.UsuarioClient;
import com.senac.pedrorogerpedroroger.dto.PedidoDTO;
import com.senac.pedrorogerpedroroger.dto.UsuarioDTO;
import com.senac.pedrorogerpedroroger.entity.Pedido;
import com.senac.pedrorogerpedroroger.entity.Usuario;
import com.senac.pedrorogerpedroroger.repository.PedidoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private UsuarioClient usuarioClient;

    @Autowired
    private ModelMapper modelMapper;

    public List<PedidoDTO> buscarPedidoPorUsuario(int usuarioId){
        List<Pedido> pedidos = this.pedidoRepository.findByUsuarioUsuarioId(usuarioId);
        List<PedidoDTO> pedidosDTO = new ArrayList<PedidoDTO>();
        for (Pedido pedido : pedidos) {
            pedidosDTO.add(modelMapper.map(pedido, PedidoDTO.class));
        }
        return pedidosDTO;
    }







    public Pedido criarPedido(PedidoDTO pedidoDTO) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setUsuario_nome("Nome do Usuário");
        usuarioDTO.setUsuario_cpf("12345678901");
        usuarioDTO.setUsuario_status(1);
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


}
