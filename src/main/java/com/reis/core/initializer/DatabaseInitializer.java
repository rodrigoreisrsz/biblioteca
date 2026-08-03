//package com.reis.core.initializer;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.sql.Connection;
//import java.sql.Statement;
//
//public class DatabaseInitializer {
//
//    public static void inicializarBanco(Connection conn, String "C:\Users\User\Desktop\Bibilioteca\src\main\resources\script.sql") {
//        try (BufferedReader br = new BufferedReader(new FileReader(caminhoScript));
//             Statement stmt = conn.createStatement()) {
//
//            StringBuilder sql = new StringBuilder();
//            String linha;
//            while ((linha = br.readLine()) != null) {
//                sql.append(linha).append("\n");
//            }
//
//            stmt.execute(sql.toString());
//            System.out.println("Script SQL executado com sucesso!");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}