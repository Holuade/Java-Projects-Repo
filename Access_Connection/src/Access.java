
import java.sql.*;
import java.util.Scanner;

public class Access {

    public static void main(String arg[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Gender: ");
        String a = in.nextLine();

        System.out.println("Enter Name: ");
        String b = in.nextLine();

        System.out.println("Enter Level: ");
        String c = in.nextLine();

        System.out.println("Enter Department: ");
         String d =    in.nextLine();     
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\USER\\Documents\\Database1.accdb");
            Statement stm = conn.createStatement();
            stm.executeUpdate("insert into admin3 values('" + a + "','" + b + "','" + c + "','" + d + "')");
            System.out.println("\nSaved");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
