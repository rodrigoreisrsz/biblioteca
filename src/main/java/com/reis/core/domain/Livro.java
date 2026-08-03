package com.reis.core.domain;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private boolean disponivel = false;


    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;

    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean getDisponivel() {
        return disponivel;
    }


}
