package com.java.prime.com;
import java.sql.*;  
public class Jdbbc {
	
	 
	public static void main(String ar[]){  
	 try{  
	   String url="jdbc:odbc:mydsn";  
	   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
	   Connection c=DriverManager.getConnection(url);  
	   Statement st=c.createStatement();  
	   ResultSet rs=st.executeQuery("select * from login");  
	    
	   while(rs.next()){  
	    System.out.println(rs.getString(1));  
	   }  
	  
	}catch(Exception ee){System.out.println(ee);}  
	  
	}
}
