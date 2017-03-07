package dao;

import java.sql.Connection;

import static java.sql.DriverManager.getConnection;

public class JDBCExample {
    public static void blah(String args[]) {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = getConnection("jdbc:postgresql://localhost:5432/country", "postgres", "@Yishwarya2510");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }
}
