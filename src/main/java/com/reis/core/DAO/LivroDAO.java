package com.reis.core.DAO;

import com.reis.core.connection.DatabaseConnection;
import com.reis.core.domain.Livro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LivroDAO {
    public void salvar(Livro livro) throws SQLException {
        String sql = "INSERT INTO livros(titulo, autor, disponivel) VALUES (?, ?, ?)";
        Connection conn = null;
        PreparedStatement pstm = null;

        try{
            conn = DatabaseConnection.obterConexao();
            //adiciona os valores esperados pela query
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, livro.getTitulo());
            pstm.setString(2, livro.getAutor());
            pstm.setBoolean(3, livro.getDisponivel());

            //executar a query
            pstm.execute();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            // fecha as conexões caso estejam abertas
            try{
                if(pstm != null){
                    pstm.close();
                }
                if(conn!=null){
                    conn.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }

        }
    }
}
