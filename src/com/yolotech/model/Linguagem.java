package com.yolotech.model;

public class Linguagem {
    private String nomeLinguagem;
    private int popularidade;
    private boolean linguagemAtiva;

    public Linguagem() {
    }

    public Linguagem(String nomeLinguagem) {
        this.nomeLinguagem = nomeLinguagem;
    }

    public Linguagem(String nomeLinguagem, boolean linguagemAtiva) {
        this.nomeLinguagem = nomeLinguagem;
        this.linguagemAtiva = linguagemAtiva;
    }

    public Linguagem(String nomeLinguagem, int popularidade, boolean linguagemAtiva) {
        this.nomeLinguagem = nomeLinguagem;
        this.popularidade = popularidade;
        this.linguagemAtiva = linguagemAtiva;
    }

    public String getNomeLinguagem() {
        return nomeLinguagem;
    }

    public void setNomeLinguagem(String nomeLinguagem) {
        this.nomeLinguagem = nomeLinguagem;
    }

    public int getPopularidade() {
        return popularidade;
    }

    public void setPopularidade(int popularidade) {
        this.popularidade = popularidade;
    }

    public boolean isLinguagemAtiva() {
        return linguagemAtiva;
    }

    public void setLinguagemAtiva(boolean linguagemAtiva) {
        this.linguagemAtiva = linguagemAtiva;
    }

    @Override
    public String toString() {
        return "Linguagem{" +
                "nomeLinguagem='" + nomeLinguagem + '\'' +
                ", popularidade=" + popularidade +
                ", linguagemAtiva=" + linguagemAtiva +
                '}';
    }
}
