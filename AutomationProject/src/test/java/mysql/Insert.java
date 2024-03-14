package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
public static void main(String[] args) throws SQLException {
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","tiger@12");
	
	Statement stat = con.createStatement();
	
	String s=("create table employee(id int,name varchar(45),salary int,location varchar(45))");
	
	
	stat.executeUpdate(s);
	
	con.close();
	
	System.out.println("Table is created successfully");
}
}
