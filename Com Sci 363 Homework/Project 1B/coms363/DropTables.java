package coms363;

import java.sql.*;
public class DropTables {
	private static Connection connect = null;
	
	public static void main(String[] args) 
	{
		String sql = "";

		try {
			//Set up connection parameters
			String userName = "coms363";
			String password = "password";
			String dbServer = "jdbc:mysql://localhost:3306/project1";
			//String dbServer = "jdbc:mysql://mysql.cs.iastate.edu/[schema]";
			//Set up connection
			connect = DriverManager.getConnection(dbServer,userName,password);
			
		} catch(Exception e) {

		}

		Statement stmt = null;
		
		try {
			stmt = connect.createStatement();
			sql = "drop table departments, degrees, students, courses, major, register, minor;";
			stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	 finally {
			try {
				// Close connection
				if (stmt != null) {
					stmt.close();
				}
				if (connect != null) {
					connect.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
