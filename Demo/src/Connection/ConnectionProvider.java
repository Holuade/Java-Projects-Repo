/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

/**
 *
 * @author StatiSense
 */
import java.sql.*;
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
             Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/demo","root","");
             return conn;
        }
        catch(Exception e){
            return null;
        }
    }
    
}
