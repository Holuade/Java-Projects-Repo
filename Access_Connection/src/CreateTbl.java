

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author BitwisePathway
 */
//public class db4_createTbl_registration {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
//    
//}
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CreateTbl {

    static final String DB_URL = "jdbc:mysql://localhost/group_work?server"
            + "Timezone=UTC";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) {
        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();) {
            String sql = "CREATE TABLE user "
                    + "(id INTEGER not NULL AUTO_INCREMENT, "
                    + " name VARCHAR(255), "
                    + " address VARCHAR(255), "
                    + " PRIMARY KEY ( id ))";

            stmt.executeUpdate(sql);
            System.out.println("Created table in the given database...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
