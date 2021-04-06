package com.yolotech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empresa")
public class Empresa {

    @Id
    @GeneratedValue
    private Long idEmpresa;
    private String nomeEmpresa;
    private String siteEmpresa;
    private boolean empresaAtiva;

    public Empresa() {
    }

    public Empresa(String nomeEmpresa, String siteEmpresa, boolean empresaAtiva) {
        this.nomeEmpresa = nomeEmpresa;
        this.siteEmpresa = siteEmpresa;
        this.empresaAtiva = empresaAtiva;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getSiteEmpresa() {
        return siteEmpresa;
    }

    public void setSiteEmpresa(String siteEmpresa) {
        this.siteEmpresa = siteEmpresa;
    }

    public boolean isEmpresaAtiva() {
        return empresaAtiva;
    }

    public void setEmpresaAtiva(boolean empresaAtiva) {
        this.empresaAtiva = empresaAtiva;
    }
}
