package com.yolotech.model;

public class Curso {
    private String nomeCurso;
    private String descricao;
    private String professor;
    private PerfilAdminEmpresa dadosEmpresa;
    private CampoDeEstudo cDE;
    private Linguagem linguagem;
    private String siteCurso;
    private double notaCurso;
    private boolean cursoAtivo;

    public Curso(String nomeCurso, String descricao, String professor, PerfilAdminEmpresa dadosEmpresa,
                 CampoDeEstudo cDE, Linguagem linguagem, String siteCurso, double notaCurso,
                 boolean cursoAtivo) {
        this.nomeCurso = nomeCurso;
        this.descricao = descricao;
        this.professor = professor;
        this.dadosEmpresa = dadosEmpresa;
        this.cDE = cDE;
        this.linguagem = linguagem;
        this.siteCurso = siteCurso;
        this.notaCurso = notaCurso;
        this.cursoAtivo = cursoAtivo;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public PerfilAdminEmpresa getDadosEmpresa() {
        return dadosEmpresa;
    }

    public void setDadosEmpresa(PerfilAdminEmpresa dadosEmpresa) {
        this.dadosEmpresa = dadosEmpresa;
    }

    public CampoDeEstudo getcDE() {
        return cDE;
    }

    public void setcDE(CampoDeEstudo cDE) {
        this.cDE = cDE;
    }

    public Linguagem getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(Linguagem linguagem) {
        this.linguagem = linguagem;
    }

    public String getSiteCurso() {
        return siteCurso;
    }

    public void setSiteCurso(String siteCurso) {
        this.siteCurso = siteCurso;
    }

    public double getNotaCurso() {
        return notaCurso;
    }

    public void setNotaCurso(double notaCurso) {
        this.notaCurso = notaCurso;
    }

    public boolean isCursoAtivo() {
        return cursoAtivo;
    }

    public void setCursoAtivo(boolean cursoAtivo) {
        this.cursoAtivo = cursoAtivo;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nomeCurso='" + nomeCurso + '\'' +
                ", descricao='" + descricao + '\'' +
                ", professor='" + professor + '\'' +
                ", dadosEmpresa=" + dadosEmpresa +
                ", cDE=" + cDE +
                ", linguagem=" + linguagem +
                ", siteCurso='" + siteCurso + '\'' +
                ", notaCurso=" + notaCurso +
                ", cursoAtivo=" + cursoAtivo +
                '}';
    }
}
