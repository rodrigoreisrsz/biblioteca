package com.reis.core.domain;

import com.reis.core.exceptions.EstoqueLivrosInsuficienteException;
import com.reis.core.exceptions.LivroIndisponivelException;
import com.reis.core.service.funcoesBiblioeteca;



import java.util.Arrays;

public abstract class Biblioteca implements funcoesBiblioeteca {
    Livro[]livros = new Livro[10];
    private int quantidadeDeLivros =0;

    public Livro[] getLivros() {
        return livros;
    }


    public void cadastrarLivro(Livro livro) {
        for(int i = 0; i< livros.length; i++){
            if(livros[i] == null){
                livros[i] = livro;
                quantidadeDeLivros++;
                break;
            }
        }
    }
    public void livrosDisponiveis() throws EstoqueLivrosInsuficienteException {
        if(livros == null){
            throw new EstoqueLivrosInsuficienteException();
        }
        for(Livro livros: livros){
            System.out.println(livros);
        }
    }
    public void removerLivro(Livro livro) throws LivroIndisponivelException{
        for (int i = 0; i < livros.length; i++) {
            if(livro == null){
                throw new LivroIndisponivelException();
            }



        }
        boolean encontrado = false;
        for (int i = 0; i < livros.length; i++) {
            if(livros[i] != null && livros[i].getTitulo().equals(livro.getTitulo())
            && livros[i].getAutor().equals(livro.getAutor())){
                livros[i] = null;
                quantidadeDeLivros--;
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            System.out.println("Livro removido com sucesso.");
        }else{
            throw new LivroIndisponivelException();
        }
    }


    public void emprestarLivro(Livro livro) throws LivroIndisponivelException {
        if(livro.getDisponivel() == false){
            throw new LivroIndisponivelException();
        }else{
            System.out.println("Livro disponivel, pode ser emprestado");
        }



    }


    @Override
    public String toString() {
        return "Biblioeteca{" +
                "livros=" + Arrays.toString(livros) +
                ", quantidadeDeLivros=" + quantidadeDeLivros +
                '}';
    }
}
