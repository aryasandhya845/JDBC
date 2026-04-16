package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertProgramUsingJdbc {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/College";
        String username = "root";
        String password = "root";

        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            // 1st step: Load Driver (No longer strictly needed with newer JDBC versions)
            Class.forName("com.mysql.cj.jdbc.Driver");  // Correct Driver class name for MySQL Connector/J 8.x+

            // 2nd step: Create Connection
            con = DriverManager.getConnection(url, username, password);

            // 3rd step: Prepare Statement
            String query = "INSERT INTO Students (id, name, gender) VALUES (?, ?, ?)";
            pstmt = con.prepareStatement(query);

            // Set parameter values
            pstmt.setInt(1, 1);
            pstmt.setString(2, "ramu");
            pstmt.setString(3, "male");

            // 4th step: Execute Update
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " row(s) inserted.");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 5th step: Close resources in reverse order of creation
            try {
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
