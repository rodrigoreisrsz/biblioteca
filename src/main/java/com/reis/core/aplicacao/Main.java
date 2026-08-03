package com.reis.core.aplicacao;

import com.reis.core.DAO.LivroDAO;
import com.reis.core.domain.Livro;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Livro livro = new Livro("algoritmos", "o reilly");

        LivroDAO livroDao = new LivroDAO();
        livroDao.salvar(livro);

    }
}
