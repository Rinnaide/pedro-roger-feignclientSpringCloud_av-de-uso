package com.senac.pedrorogerpedroroger.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="usuario_id")
    private int usuarioId;

    @Column(name="usuario_nome")
    private String usuario_nome;

    @Column(name="usuario_cpf")
    private String usuario_cpf;

    @Column(name="usuario_status")
    private Integer usuariotatus;

    @OneToMany(mappedBy = "pedidoId")
    List<Pedido> pedidos;

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getUsuario_nome() {
        return usuario_nome;
    }

    public void setUsuario_nome(String usuario_nome) {
        this.usuario_nome = usuario_nome;
    }

    public String getUsuario_cpf() {
        return usuario_cpf;
    }

    public void setUsuario_cpf(String usuario_cpf) {
        this.usuario_cpf = usuario_cpf;
    }

    public Integer getUsuariotatus() {
        return usuariotatus;
    }

    public void setUsuariotatus(Integer usuariotatus) {
        this.usuariotatus = usuariotatus;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
