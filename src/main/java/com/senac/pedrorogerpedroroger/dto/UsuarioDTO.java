package com.senac.pedrorogerpedroroger.dto;

public class UsuarioDTO {

    private String usuarioNome;
    private String usuarioCpf;
    private Integer usuarioStatus;

    public UsuarioDTO() {}

    public UsuarioDTO(String usuarioNome, String usuarioCpf, Integer usuarioStatus) {
        this.usuarioNome = usuarioNome;
        this.usuarioCpf = usuarioCpf;
        this.usuarioStatus = usuarioStatus;
    }

    public String getUsuarioNome() {
        return usuarioNome;
    }

    public void setUsuarioNome(String usuarioNome) {
        this.usuarioNome = usuarioNome;
    }

    public String getUsuarioCpf() {
        return usuarioCpf;
    }

    public void setUsuarioCpf(String usuarioCpf) {
        this.usuarioCpf = usuarioCpf;
    }

    public Integer getUsuarioStatus() {
        return usuarioStatus;
    }

    public void setUsuarioStatus(Integer usuarioStatus) {
        this.usuarioStatus = usuarioStatus;
    }
}
