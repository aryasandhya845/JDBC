package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FirstProgramJdbc {

    public static void main(String[] args) throws Exception {
      
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
    	
    	
    	String s="insert into student(id ,name,age)value(?,?,?)";
    	 
    	PreparedStatement p= con.prepareStatement(s);
    	
    	
    	p.setInt(1, 6);
    	p.setString(2, "riya");
    	p.setInt(3, 21);
    	
    	int result=p.executeUpdate();
    	
    	System.out.println(result+"record insert successfully");
    	
    
    	con.close();
    	
    	
    
       
    }
}
