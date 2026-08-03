package com.reis.core.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection obterConexao() throws RuntimeException {
        try{
            Connection obterConexao = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/biblioteca",
                    "postgres",
                    "rdjava"
            );
            return obterConexao;
        }catch(SQLException e){
            throw new RuntimeException("Erro ao conectar", e);
        }


    }

}
