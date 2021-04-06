package com.yolotech.model;

import java.util.Date;

public class PerfilAdmin extends Conta {
    private String nomeAdmin;
    private String sobrenomeAdmin;
    private String numCelularAdmin;
    private Date dataCadastroAdmin;
    private Date ultimoLoginAdmin;
    private boolean contaAtivaAdmin;

    public PerfilAdmin(String nomeUsuario, String senha, Integer tipoConta, String nomeAdmin,
                       String sobrenomeAdmin, String numCelularAdmin) {
        super(nomeUsuario, senha, tipoConta);
        this.nomeAdmin = nomeAdmin;
        this.sobrenomeAdmin = sobrenomeAdmin;
        this.numCelularAdmin = numCelularAdmin;
    }

    //    public PerfilAdmin(String nomeAdmin, String sobrenomeAdmin, String numCelularAdmin) {
//        this.nomeAdmin = nomeAdmin;
//        this.sobrenomeAdmin = sobrenomeAdmin;
//        this.numCelularAdmin = numCelularAdmin;
//    }

    public String getNomeAdmin() {
        return nomeAdmin;
    }

    public void setNomeAdmin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }

    public String getSobrenomeAdmin() {
        return sobrenomeAdmin;
    }

    public void setSobrenomeAdmin(String sobrenomeAdmin) {
        this.sobrenomeAdmin = sobrenomeAdmin;
    }

    public String getNumCelularAdmin() {
        return numCelularAdmin;
    }

    public void setNumCelularAdmin(String numCelularAdmin) { this.numCelularAdmin = numCelularAdmin; }

    public Date getDataCadastroAdmin() { return dataCadastroAdmin; }

    public void setDataCadastroAdmin(Date dataCadastroAdmin) { this.dataCadastroAdmin = dataCadastroAdmin; }

    public Date getUltimoLoginAdmin() {
        return ultimoLoginAdmin;
    }

    public void setUltimoLoginAdmin(Date ultimoLoginAdmin) {
        this.ultimoLoginAdmin = ultimoLoginAdmin;
    }

    public boolean isContaAtivaAdmin() {
        return contaAtivaAdmin;
    }

    public void setContaAtivaAdmin(boolean contaAtivaAdmin) {
        this.contaAtivaAdmin = contaAtivaAdmin;
    }

    @Override
    public String toString() {
        return "PerfilAdmin{" +
                "nomeAdmin='" + nomeAdmin + '\'' +
                ", sobrenomeAdmin='" + sobrenomeAdmin + '\'' +
                ", numCelularAdmin='" + numCelularAdmin + '\'' +
                ", dataCadastroAdmin=" + dataCadastroAdmin +
                ", ultimoLoginAdmin=" + ultimoLoginAdmin +
                ", contaAtivaAdmin=" + contaAtivaAdmin +
                '}';
    }
}
