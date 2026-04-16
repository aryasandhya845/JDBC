package jdbc;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql. PreparedStatement;

public class Secondprogram {

	public static void main(String[] args)throws Exception {
		
	  Class.forName("com.mysql.cj.dbms.Driver");
	  
	  Connection con=DriverManager.getConnection("Jdbc:mysql://localhost:3306/roomdb","root","root");
	  
	  String a="insert into Roommates(id,name,age)values(?,?,?)";
	  PreparedStatement p=con. prepareStatement(a);
	  
        p.setInt(1,19);
        p.setString(2," sandhya");
        p.setInt(3,21);
        
        int result=p.executeUpdate();
        System.out.println(result);
        
        
    con.close();
    p.close();
  
       
	  
	    

	}

}
