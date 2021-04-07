package com.yolotech.model;

import java.sql.Date;
import java.time.LocalDate;

public class Empresa {
    private Long idEmpresa;
    private String razaoSocial;
    private String cnpj;
    private String nomeFantasia;
    private String numTelefone;
    private String numCelularEmpresa;
    private String endereco;
    private String siteEmpresa;
    private LocalDate dataCadastroEmpresa;
    private boolean contaAtivaEmpresa;

    public Empresa(String razaoSocial, String cnpj, String nomeFantasia, String numTelefone,
                   String numCelularEmpresa, String endereco, String siteEmpresa) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.numTelefone = numTelefone;
        this.numCelularEmpresa = numCelularEmpresa;
        this.endereco = endereco;
        this.siteEmpresa = siteEmpresa;
    }

    public Empresa(String razaoSocial, String cnpj, String nomeFantasia, String numTelefone,
                   String numCelularEmpresa, String endereco, String siteEmpresa, LocalDate dataCadastroEmpresa,
                   boolean contaAtivaEmpresa) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.numTelefone = numTelefone;
        this.numCelularEmpresa = numCelularEmpresa;
        this.endereco = endereco;
        this.siteEmpresa = siteEmpresa;
        this.dataCadastroEmpresa = LocalDate.now();
        this.contaAtivaEmpresa = contaAtivaEmpresa;
    }

    public Empresa() {
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }

    public String getNumCelularEmpresa() {
        return numCelularEmpresa;
    }

    public void setNumCelularEmpresa(String numCelularEmpresa) {
        this.numCelularEmpresa = numCelularEmpresa;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSiteEmpresa() {
        return siteEmpresa;
    }

    public void setSiteEmpresa(String siteEmpresa) {
        this.siteEmpresa = siteEmpresa;
    }

    public LocalDate getDataCadastroEmpresa() {
        return dataCadastroEmpresa;
    }

    public void setDataCadastroEmpresa(String dataCadastroEmpresa) {
        this.dataCadastroEmpresa = LocalDate.now();
    }

    public boolean isContaAtivaEmpresa() {
        return contaAtivaEmpresa;
    }

    public void setContaAtivaEmpresa(boolean contaAtivaEmpresa) {
        this.contaAtivaEmpresa = contaAtivaEmpresa;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "idEmpresa=" + idEmpresa +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", numTelefone='" + numTelefone + '\'' +
                ", numCelularEmpresa='" + numCelularEmpresa + '\'' +
                ", endereco='" + endereco + '\'' +
                ", siteEmpresa='" + siteEmpresa + '\'' +
                ", dataCadastroEmpresa=" + dataCadastroEmpresa +
                ", contaAtivaEmpresa=" + contaAtivaEmpresa +
                '}';
    }
}
