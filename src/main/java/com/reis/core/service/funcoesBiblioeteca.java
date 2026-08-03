package com.reis.core.service;

import com.reis.core.domain.Livro;
import com.reis.core.exceptions.LivroIndisponivelException;

public interface funcoesBiblioeteca {
    void emprestarLivro(Livro Livro) throws LivroIndisponivelException;
    void cadastrarLivro(Livro livro);

}
