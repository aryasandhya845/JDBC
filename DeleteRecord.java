package jdbc;
import java.sql.*;


public class DeleteRecord {

	public static void main(String[] args)  {
		
		try
		{
			
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
		 
          String stmt="Delete from student where id=?";
          
          
          PreparedStatement pst=con. prepareStatement(stmt);
          
           pst.setInt(1, 1);
           
        int result=pst.executeUpdate();
        con.close();
		}
        catch(Exception e)
		{
        	System.err.println(e);
         
	}

}
}