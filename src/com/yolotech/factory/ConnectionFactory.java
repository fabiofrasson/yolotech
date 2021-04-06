package com.yolotech.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection() {
        try {
//            System.out.println("Conectado com sucesso!");
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost/yolotech", "root", "");
            } catch (SQLException e) {
//            System.out.println("Falha na conexão :(");
            throw new RuntimeException(e);
        }
    }
}