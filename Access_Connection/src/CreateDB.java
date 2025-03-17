
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author BitwisePathway
 */
//public class  {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
//    
//}
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateDB {

    public static void main(String[] args) {
        // Defines the JDBC URL. As you can see, we are not specifying
        // the database name in the URL.
        String url = "jdbc:mysql://localhost/?serverTimezone=UTC";
        // Defines username and password to connect to the database server.
        String username = "root";
        String password = "";

        // SQL command to create a database in MySQL.
        String sql = "CREATE DATABASE IF NOT EXISTS group_work";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(url, username, password);
                    PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.execute();
                System.out.println("Database was created successfully.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
