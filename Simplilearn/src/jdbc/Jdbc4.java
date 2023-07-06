package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc4 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String dburl = "jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "root";
		String query = "create database action_movies;"; 
		String query2 = "use action_movies;";
		String query3 = "drop database action_movies";
				
				
				
				
				
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dburl,username,password);
			Statement stmt = con.createStatement();
			stmt.execute(query);
			System.out.println("database created");
			stmt.execute(query2);
			System.out.println("using action movies");
			stmt.execute(query3);
			System.out.println("database deleted");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			con.close();
		}
		

	}

}
