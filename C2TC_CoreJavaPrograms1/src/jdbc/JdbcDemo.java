package jdbc;

import java.sql.*;

public class JdbcDemo {

    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:postgresql://127.0.0.1:5432/Student";
        String user = "postgres"; // your PostgreSQL username
        String password = "Paapu@30"; // your PostgreSQL password

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load PostgreSQL JDBC Driver
            Class.forName("org.postgresql.Driver");

            // Establish Connection
            conn = DriverManager.getConnection(url, user, password);

            // Create Statement
            stmt = conn.createStatement();

            // Execute Query (Make sure 'employee' table exists in your 'Student' database)
            String query = "SELECT * FROM employee";
            rs = stmt.executeQuery(query);

            // Print results
            System.out.println("Employee Details:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String city = rs.getString("city");
                System.out.println("ID: " + id + ", Name: " + name + ", City: " + city);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
