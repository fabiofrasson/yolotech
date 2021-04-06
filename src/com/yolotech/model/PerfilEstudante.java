package com.yolotech.model;

import java.util.Date;

public class PerfilEstudante {
    private String nomeEstudante;
    private String sobrenomeEstudante;
    private String cpf;
    private String numCelularEstudante;
    private Endereco enderecoEstudante;
    private Date dataCadastroEstudante;
    private Date ultimoLoginEstudante;
    private boolean contaAtivaEstudante;

    public PerfilEstudante(String nomeEstudante, String sobrenomeEstudante, String cpf,
                           String numCelularEstudante, Endereco enderecoEstudante) {
        this.nomeEstudante = nomeEstudante;
        this.sobrenomeEstudante = sobrenomeEstudante;
        this.cpf = cpf;
        this.numCelularEstudante = numCelularEstudante;
        this.enderecoEstudante = enderecoEstudante;
    }

    public String getNomeEstudante() {
        return nomeEstudante;
    }

    public void setNomeEstudante(String nomeEstudante) {
        this.nomeEstudante = nomeEstudante;
    }

    public String getSobrenomeEstudante() {
        return sobrenomeEstudante;
    }

    public void setSobrenomeEstudante(String sobrenomeEstudante) {
        this.sobrenomeEstudante = sobrenomeEstudante;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumCelularEstudante() {
        return numCelularEstudante;
    }

    public void setNumCelularEstudante(String numCelularEstudante) {
        this.numCelularEstudante = numCelularEstudante;
    }

    public Endereco getEnderecoEstudante() {
        return enderecoEstudante;
    }

    public void setEnderecoEstudante(Endereco enderecoEstudante) {
        this.enderecoEstudante = enderecoEstudante;
    }

    public Date getDataCadastroEstudante() {
        return dataCadastroEstudante;
    }

    public void setDataCadastroEstudante(Date dataCadastroEstudante) {
        this.dataCadastroEstudante = dataCadastroEstudante;
    }

    public Date getUltimoLoginEstudante() {
        return ultimoLoginEstudante;
    }

    public void setUltimoLoginEstudante(Date ultimoLoginEstudante) {
        this.ultimoLoginEstudante = ultimoLoginEstudante;
    }

    public boolean isContaAtivaEstudante() {
        return contaAtivaEstudante;
    }

    public void setContaAtivaEstudante(boolean contaAtivaEstudante) {
        this.contaAtivaEstudante = contaAtivaEstudante;
    }

    @Override
    public String toString() {
        return "PerfilEstudante{" +
                "nomeEstudante='" + nomeEstudante + '\'' +
                ", sobrenomeEstudante='" + sobrenomeEstudante + '\'' +
                ", cpf='" + cpf + '\'' +
                ", numCelularEstudante='" + numCelularEstudante + '\'' +
                ", enderecoEstudante=" + enderecoEstudante +
                ", dataCadastroEstudante=" + dataCadastroEstudante +
                ", ultimoLoginEstudante=" + ultimoLoginEstudante +
                ", contaAtivaEstudante=" + contaAtivaEstudante +
                '}';
    }
}
