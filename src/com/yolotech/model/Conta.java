package com.yolotech.model;

public class Conta {
    private String nomeUsuario;
    private String senha;
    private Integer tipoConta;

    public Conta(String nomeUsuario, String senha, Integer tipoConta) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.tipoConta = tipoConta;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(Integer tipoConta) {
        this.tipoConta = tipoConta;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nomeUsuario='" + nomeUsuario + '\'' +
                ", senha='" + senha + '\'' +
                ", tipoConta=" + tipoConta +
                '}';
    }

    public String tratamentoTipoConta() {
        if (tipoConta == 1) {
            return "Admin";
        } else if (tipoConta == 2) {
            return "AdminEmpresa";
        } else {
            return "Estudante";
        }
    }
}
