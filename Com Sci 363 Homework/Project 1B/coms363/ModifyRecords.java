package coms363;

import java.sql.*;
public class ModifyRecords {
	private static Connection connect = null;
	private static Connection connect2 = null;
	private static Connection connect3 = null;
	

	public static void main(String[] args) 
	{
		String sql = "";
		String sql2 = "";
		String sql3 = "";
		
		
		

		try {
			//Set up connection parameters
			String userName = "coms363";
			String password = "password";
			String dbServer = "jdbc:mysql://localhost:3306/project1";
			//String dbServer = "jdbc:mysql://mysql.cs.iastate.edu/[schema]";
			//Set up connection
			connect = DriverManager.getConnection(dbServer,userName,password);
			connect2 = DriverManager.getConnection(dbServer,userName,password);
			connect3 = DriverManager.getConnection(dbServer,userName,password);
			
		} catch(Exception e) {

		}

		Statement stmt = null;
		Statement stmt2 = null;
		Statement stmt3 = null;
		
		try {
			stmt = connect.createStatement();
			sql = "update students set name = \"Scott\" where ssn = 746897816;";
			stmt.executeUpdate(sql);
				
		
			stmt2 = connect2.createStatement();
			sql2 = "update major set name = \"Computer Science\", level = \"MS\" where snum in (select snum from students where ssn = 746897816);";
			stmt2.executeUpdate(sql2);
			
			stmt3 = connect3.createStatement();
			sql3 = "delete from register where regtime = \"Spring2021\";"; 
			stmt3.executeUpdate(sql3);		
			
			
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
				if(stmt2 != null) {
					stmt2.close();
				}
				if(stmt3 != null) {
					stmt3.close();
				}
				if (connect != null) {
					connect.close();
				}
				if (connect2 != null) {
					connect2.close();
				}
				if (connect3 != null) {
					connect3.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
