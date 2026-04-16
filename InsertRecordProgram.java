package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertRecordProgram {

	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","root");
       
       		 String query = "Insert into test(id,name,age)values(?,?,?)";
       				 
       		PreparedStatement ptr =	con.prepareStatement(query);
       		ptr.setInt(1,1);
       		ptr.setString(2, "sandhya");
       		ptr.setInt(3, 21);
       		
       		int result= ptr.executeUpdate();
       		System.err.println(result);
       		 
       		con.close();
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		
		
		
       				 
       				 

	}

}
