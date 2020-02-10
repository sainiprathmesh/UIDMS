package uidms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static Connection conn = null;

    void connection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to database....");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/UIDM", "root", "");
            System.out.println("Connected to database successfully....");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
