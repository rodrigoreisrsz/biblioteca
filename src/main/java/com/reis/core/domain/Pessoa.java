package com.reis.core.domain;

public abstract class Pessoa {
    private String nome;
    private String idade;

    public Pessoa(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
