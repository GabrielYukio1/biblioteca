package com.example.cadastroautor.model;

public class Autor {

    private String nome;
    private String nacionalidade;
    private String obraConhecida;

    public Autor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getObraConhecida() {
        return obraConhecida;
    }

    public void setObraConhecida(String obraConhecida) {
        this.obraConhecida = obraConhecida;
    }
}

