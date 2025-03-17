/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author StatiSense
 */
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
    static final String DB_URL = "jdbc:mysql://localhost/group_work?serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) {
        // Open a connection
        try {Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO members (name, address) VALUES ( ?, ?)");
            
            // Set the parameter values for the prepared statement
            stmt.setString(1, "John Jack");
            stmt.setString(2, "123 Main St");
            
            // Execute the statement
            int rowsAffected = stmt.executeUpdate();
            
            System.out.println(rowsAffected + " row(s) inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
