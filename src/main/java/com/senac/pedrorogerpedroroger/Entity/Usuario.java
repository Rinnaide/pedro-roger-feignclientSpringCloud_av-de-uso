package com.senac.pedrorogerpedroroger.Entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int usuario_id;

    @Column(name="usuario_nome")
    String usuario_nome;

    @Column(name="usuario_cpf")
    String usuario_cpf;

    @Column(name="usuario_status")
    int usuario_status;


    @OneToMany(mappedBy = "pedidoId")
    List<Pedido> pedidos;


    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
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

    public int getUsuario_status() {
        return usuario_status;
    }

    public void setUsuario_status(int usuario_status) {
        this.usuario_status = usuario_status;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
