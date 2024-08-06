package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/testemysql", "root", "123");

            Statement statement = connection.createStatement();

            statement.executeUpdate("insert into pessoa (nome) values ('marcelogod')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}