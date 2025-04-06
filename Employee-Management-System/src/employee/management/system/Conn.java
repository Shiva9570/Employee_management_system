package employee.management.system;

import java.sql.*;

public class Conn {
    
    public Connection c;
    public Statement s;

    public Conn() {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully!");

            // Establish the database connection
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagementsystem?useSSL=false", "root", "Shiv9570@");
            System.out.println("Database Connected Successfully!");

            // Create a statement object for executing SQL queries
            s = c.createStatement();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver Not Found! Add the Connector/J JAR to your project.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database Connection Failed! Check your URL, username, or password.");
            e.printStackTrace();
        }
    }
}
