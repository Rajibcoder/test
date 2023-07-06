package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc5 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		String query = "insert into movies values('Extraction','action','RDJ','2023');";
		String query3 = "update movies set genre = 'action comedy' where title = 'Inside Out';";
		String query4 = "delete from movies where title = 'Extraction';";
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dburl,username,password);
			Statement stmt = con.createStatement();
			stmt.execute(query);
			System.out.println("insertion done");
			stmt.execute(query3);
			System.out.println("updation done");
			stmt.execute(query4);
			System.out.println("deletion done");
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			con.close();
		}

	}

}
