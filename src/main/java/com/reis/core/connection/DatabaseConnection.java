package com.reis.core.connection;

import java.sql.*;

public class DatabaseConnection {
    public static Connection obterConexao() throws RuntimeException {
        try {
            Connection obterConexao = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/testebanco",
                    "postgres",
                    "rdzap"
            );
            return obterConexao;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar", e);
        }

    }

    public static void closeStatements(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                e.getMessage();
            }
        }
    }

    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.getMessage();
            }
        }
    }

    public static void closeConnection(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.getMessage();
            }
        }
    }

}
