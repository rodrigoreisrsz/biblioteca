package com.reis.core.exceptions;

public class LivroIndisponivelException extends Exception {
    public LivroIndisponivelException() {
        System.out.println("Este livro está indisponível.");
    }
}
