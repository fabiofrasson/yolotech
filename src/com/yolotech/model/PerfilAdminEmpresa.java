package com.yolotech.model;

import java.util.Calendar;
import java.util.Date;

public class PerfilAdminEmpresa {
    private String razaoSocialEmpresa;
    private String cnpj;
    private String nomeFantasia;
    private String numTelefone;
    private String numCelularEmpresa;
    private String enderecoEmpresa;
    private String siteEmpresa;
    private CampoDeEstudo quantCDE;
    private Calendar dataCadastroEmpresa;
    private Date ultimoLoginEmpresa;
    private boolean contaAtivaEmpresa;

    public PerfilAdminEmpresa(String razaoSocialEmpresa, String cnpj, String nomeFantasia,
                              String numTelefone, String numCelularEmpresa,
                              String enderecoEmpresa, String siteEmpresa,
                              Calendar dataCadastroEmpresa, boolean contaAtivaEmpresa) {
        this.razaoSocialEmpresa = razaoSocialEmpresa;
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.numTelefone = numTelefone;
        this.numCelularEmpresa = numCelularEmpresa;
        this.enderecoEmpresa = enderecoEmpresa;
        this.siteEmpresa = siteEmpresa;
        this.dataCadastroEmpresa = dataCadastroEmpresa;
        this.contaAtivaEmpresa = contaAtivaEmpresa;
    }

    public String getRazaoSocialEmpresa() {
        return razaoSocialEmpresa;
    }

    public void setRazaoSocialEmpresa(String razaoSocialEmpresa) {
        this.razaoSocialEmpresa = razaoSocialEmpresa;
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

    public String getEnderecoEmpresa() {
        return enderecoEmpresa;
    }

    public void setEnderecoEmpresa(String enderecoEmpresa) {
        this.enderecoEmpresa = enderecoEmpresa;
    }

    public String getSiteEmpresa() {
        return siteEmpresa;
    }

    public void setSiteEmpresa(String siteEmpresa) {
        this.siteEmpresa = siteEmpresa;
    }

    public Calendar getDataCadastroEmpresa() {
        return dataCadastroEmpresa;
    }

    public void setDataCadastroEmpresa(Calendar dataCadastroEmpresa) {
        this.dataCadastroEmpresa = dataCadastroEmpresa;
    }

    public boolean isContaAtivaEmpresa() {
        return contaAtivaEmpresa;
    }

    public void setContaAtivaEmpresa(boolean contaAtivaEmpresa) {
        this.contaAtivaEmpresa = contaAtivaEmpresa;
    }

    @Override
    public String toString() {
        return "PerfilAdminEmpresa{" +
                "razaoSocialEmpresa='" + razaoSocialEmpresa + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", numTelefone='" + numTelefone + '\'' +
                ", numCelularEmpresa='" + numCelularEmpresa + '\'' +
                ", enderecoEmpresa=" + enderecoEmpresa +
                ", siteEmpresa='" + siteEmpresa + '\'' +
                ", quantCDE=" + quantCDE +
                ", dataCadastroEmpresa=" + dataCadastroEmpresa +
                ", ultimoLoginEmpresa=" + ultimoLoginEmpresa +
                ", contaAtivaEmpresa=" + contaAtivaEmpresa +
                '}';
    }
}
