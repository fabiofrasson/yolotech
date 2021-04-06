package com.yolotech.model;

public class AvaliacaoCurso {
    private String nomeCurso;
    private PerfilAdminEmpresa empresa;
    private Linguagem linguagem;
    private CampoDeEstudo cDE;
    private double nota;
    private double notaProfessor;
    private String comentarioProfessor;
    private String comentarioCurso;
    private PerfilEstudante autor;

    public AvaliacaoCurso(String nomeCurso, PerfilAdminEmpresa empresa, Linguagem linguagem,
                          CampoDeEstudo cDE, double nota, double notaProfessor, String
                                  comentarioProfessor, String comentarioCurso, PerfilEstudante autor) {
        this.nomeCurso = nomeCurso;
        this.empresa = empresa;
        this.linguagem = linguagem;
        this.cDE = cDE;
        this.nota = nota;
        this.notaProfessor = notaProfessor;
        this.comentarioProfessor = comentarioProfessor;
        this.comentarioCurso = comentarioCurso;
        this.autor = autor;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public PerfilAdminEmpresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(PerfilAdminEmpresa empresa) {
        this.empresa = empresa;
    }

    public Linguagem getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(Linguagem linguagem) {
        this.linguagem = linguagem;
    }

    public CampoDeEstudo getcDE() {
        return cDE;
    }

    public void setcDE(CampoDeEstudo cDE) {
        this.cDE = cDE;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNotaProfessor() {
        return notaProfessor;
    }

    public void setNotaProfessor(double notaProfessor) {
        this.notaProfessor = notaProfessor;
    }

    public String getComentarioProfessor() {
        return comentarioProfessor;
    }

    public void setComentarioProfessor(String comentarioProfessor) {
        this.comentarioProfessor = comentarioProfessor;
    }

    public String getComentarioCurso() {
        return comentarioCurso;
    }

    public void setComentarioCurso(String comentarioCurso) {
        this.comentarioCurso = comentarioCurso;
    }

    public PerfilEstudante getAutor() {
        return autor;
    }

    public void setAutor(PerfilEstudante autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "AvaliacaoCurso{" +
                "nomeCurso='" + nomeCurso + '\'' +
                ", empresa=" + empresa +
                ", linguagem=" + linguagem +
                ", cDE=" + cDE +
                ", nota=" + nota +
                ", notaProfessor=" + notaProfessor +
                ", comentarioProfessor='" + comentarioProfessor + '\'' +
                ", comentarioCurso='" + comentarioCurso + '\'' +
                ", autor=" + autor +
                '}';
    }
}
