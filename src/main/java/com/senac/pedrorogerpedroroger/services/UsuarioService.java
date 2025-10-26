package com.senac.pedrorogerpedroroger.services;
import com.senac.pedrorogerpedroroger.Entity.Usuario;
import com.senac.pedrorogerpedroroger.dto.UsuarioDTO;
import com.senac.pedrorogerpedroroger.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class UsuarioService {


    @Autowired
    private UsuarioRepository usuarioRepository;


    public List<Usuario> listarUsuarios() {
        return this.usuarioRepository.findAll();
    }


    public Usuario cadastrarUsuario(UsuarioDTO usuariodto) {
        Usuario newUsuario = new Usuario();
        newUsuario.setUsuario_nome(usuariodto.getUsuario_nome());
        newUsuario.setUsuario_cpf(usuariodto.getUsuario_cpf());
        newUsuario.setUsuario_status(1);
        return this.usuarioRepository.save(newUsuario);
    }

}