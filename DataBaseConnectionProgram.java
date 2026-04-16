package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class DataBaseConnectionProgram {

	public static void main(String[] args) {
		try
		{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
	
		System.err.println("coonnected successffully");
		con.close();
		}
		
		catch(Exception e)
		{
			System.err.println(e);
		}
		
		

}
}
