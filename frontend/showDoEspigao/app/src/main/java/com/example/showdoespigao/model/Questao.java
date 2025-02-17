package com.example.showdoespigao.model;

public class Questao {
    private Long id;
    private String descricao;
    private Integer nivel;
    private Opcao opcao;

    public Questao(){

    }

    public Questao(Long id, String descricao, Integer nivel, Opcao opcao) {
        this.id = id;
        this.descricao = descricao;
        this.nivel = nivel;
        this.opcao = opcao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Opcao getOpcao() {
        return opcao;
    }

    public void setOpcao(Opcao opcao) {
        this.opcao = opcao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
