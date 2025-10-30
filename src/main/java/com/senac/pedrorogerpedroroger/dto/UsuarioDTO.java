package com.senac.pedrorogerpedroroger.dto;

public class UsuarioDTO {

    private String usuario_nome;
    private String usuario_cpf;
    private Integer usuario_status;


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

    public Integer getUsuario_status() {
        return usuario_status;
    }

    public void setUsuario_status(Integer usuario_status) {
        this.usuario_status = usuario_status;
    }
}
