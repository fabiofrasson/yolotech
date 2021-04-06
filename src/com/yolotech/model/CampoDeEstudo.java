package com.yolotech.model;

public class CampoDeEstudo {
    private String nomeCDE;
    private int popularidade;

    public CampoDeEstudo() {
    }

    public CampoDeEstudo(String nomeCDE) {
        this.nomeCDE = nomeCDE;
    }

    public CampoDeEstudo(String nomeCDE, int popularidade) {
        this.nomeCDE = nomeCDE;
        this.popularidade = popularidade;
    }

    public String getNomeCDE() {
        return nomeCDE;
    }

    public void setNomeCDE(String nomeCDE) {
        this.nomeCDE = nomeCDE;
    }

    public int getPopularidade() {
        return popularidade;
    }

    public void setPopularidade(int popularidade) {
        this.popularidade = popularidade;
    }

    @Override
    public String toString() {
        return "CampoDeEstudo{" +
                "nomeCDE='" + nomeCDE + '\'' +
                ", popularidade=" + popularidade +
                '}';
    }
}
