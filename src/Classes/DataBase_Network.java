package Classes;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase_Network {
    public static Connection getConnection() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admin", "root","root");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
