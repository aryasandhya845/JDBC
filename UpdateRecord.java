package jdbc;

import java.sql.*;
public class UpdateRecord {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/class","root","root");
		    
		    String str= "update student set name=? where id=1";
		    
		   PreparedStatement ptr=con.prepareStatement(str);
		   
             ptr.setString(1, "aarohi");
            
             int count=ptr.executeUpdate();
             System.err.println(count);
             con.close();
             
		}
		catch(Exception e)
		
		{
			System.err.println(e);
		}

	}

}
