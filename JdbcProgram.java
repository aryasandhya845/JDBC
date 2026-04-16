package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class JdbcProgram {
	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
			
			String data = "insert into students values(?,?,?)";
			PreparedStatement ps=	con.prepareStatement(data);
			ps.setInt(1,1);
			ps.setString(2, "sandhya");
			ps.setInt(3, 21);
			
			
			
			Statement stmt=con.createStatement();
			   ResultSet  rs=stmt.executeQuery("select*from students");
			   
			  while(rs.next())
			  {
				  System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getInt(3));
				  
			  }
			  
			  
			  
			  PreparedStatement ps1 =con.prepareStatement("update students set age=? where id=? ");
			  ps1.setInt(1, 22);
			  ps1.setInt(2,1);
			  ps1.executeUpdate();
			  System.err.println(" recored update");
			  
			  
			  
			  PreparedStatement ps2=con.prepareStatement("Delete from students where id=1");
			  ps2.setInt(1,1);
			  ps2.executeUpdate();
			  
			  
			  con.close();
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
			  
	}

	
	}	
			


		




