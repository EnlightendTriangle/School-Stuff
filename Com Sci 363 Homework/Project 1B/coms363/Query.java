package coms363;

import java.sql.*;
public class Query {
	private static Connection connect = null;
	private static Connection connect2 = null;
	private static Connection connect3 = null;
	private static Connection connect4 = null;
	private static Connection connect5 = null;
	private static Connection connect6 = null;
	private static Connection connect7 = null;
	private static Connection connect8 = null;
	private static Connection connect9 = null;
	private static Connection connect10 = null;
	private static Connection connect11 = null;
	private static Connection connect12 = null;
	private static Connection connect13 = null;
	private static Connection connect14 = null;
	private static Connection connect15 = null;
	private static Connection connect16 = null;

	public static void main(String[] args) 
	{
		String sql = "";
		String sql2 = "";
		String sql3 = "";
		String sql4 = "";
		String sql5 = "";
		String sql6 = "";
		String sql7 = "";
		String sql8 = "";
		String sql9 = "";
		String sql10 = "";
		String sql11 = "";
		String sql12 = "";
		String sql13 = "";
		String sql14 = "";
		String sql15 = "";
		String sql16 = "";
		
		
		

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
			connect4 = DriverManager.getConnection(dbServer,userName,password);
			connect5 = DriverManager.getConnection(dbServer,userName,password);
			connect6 = DriverManager.getConnection(dbServer,userName,password);
			connect7 = DriverManager.getConnection(dbServer,userName,password);
			connect8 = DriverManager.getConnection(dbServer,userName,password);
			connect9 = DriverManager.getConnection(dbServer,userName,password);
			connect10 = DriverManager.getConnection(dbServer,userName,password);
			connect11 = DriverManager.getConnection(dbServer,userName,password);
			connect12 = DriverManager.getConnection(dbServer,userName,password);
			connect13 = DriverManager.getConnection(dbServer,userName,password);
			connect14 = DriverManager.getConnection(dbServer,userName,password);
			connect15 = DriverManager.getConnection(dbServer,userName,password);
			connect16 = DriverManager.getConnection(dbServer,userName,password);
			
		} catch(Exception e) {

		}

		Statement stmt = null;
		Statement stmt2 = null;
		Statement stmt3 = null;
		Statement stmt4 = null;
		Statement stmt5 = null;
		Statement stmt6 = null;
		Statement stmt7 = null;
		Statement stmt8 = null;
		Statement stmt9 = null;
		Statement stmt10 = null;
		Statement stmt11 = null;
		Statement stmt12 = null;
		Statement stmt13 = null;
		Statement stmt14 = null;
		Statement stmt15 = null;
		Statement stmt16 = null;
		
		try {
			stmt = connect.createStatement();
			
			sql = "select snum, ssn from students where name = \"Becky\";";
			stmt.executeQuery(sql);
		
			stmt2 = connect2.createStatement();
			
			sql2 = "select name, level from major where snum in (select snum from students where ssn = 123097834);";
			stmt2.executeQuery(sql2);
			
			stmt3 = connect3.createStatement();
			sql3 = "select name from courses where department_code in (select code from departments where name = \"Computer Science\");"; 
			stmt3.executeQuery(sql3);		
			
			stmt4 = connect4.createStatement();
			sql4 = "select name, level from degrees where department_code in (select code from departments where name = \"Computer Science\");"; 
			stmt4.executeQuery(sql4);
			
			
			stmt5 = connect5.createStatement();
			sql5 = "select name from students where snum in (select snum from minor);";
			stmt5.executeQuery(sql5);
			
			
			stmt6 = connect6.createStatement();
			sql6 = "select count(*) total_students_with_minors from students where snum in (select snum from minor);";
			stmt6.executeQuery(sql6);
			
			
			stmt7 = connect7.createStatement();
			sql7 = "select name, snum from students where snum in (select snum from register where course_number in (select number from courses where name = \"Algorithm\"));";
			stmt7.executeQuery(sql7);
			
			stmt8 = connect8.createStatement();
			sql8 = "select name, snum from students where dob order by dob asc limit 1;";
			stmt8.executeQuery(sql8);
			
			stmt9 = connect9.createStatement();
			sql9 = "select name, snum from students where snum in (select snum from register where course_number in (select number from courses where name = \"Algorithm\"));";
			stmt9.executeQuery(sql9);
			
			stmt10 = connect10.createStatement();
			sql10 = "select name, snum from students where dob order by dob desc limit 1;";
			stmt10.executeQuery(sql10);
			
			stmt11 = connect11.createStatement();
			sql11 = "select name, snum, ssn from students where name like \"%n%\" and name like \"%N%\";";
			stmt11.executeQuery(sql11);
			
			stmt12 = connect12.createStatement();
			sql12 = "select name, snum, ssn from students where name not like \"%n%\" and name not like \"%N%\";";
			stmt12.executeQuery(sql12);
			
			stmt13 = connect13.createStatement();
			sql13 = "select number, name from courses where number;";
			stmt13.executeQuery(sql13);
			
			stmt14 = connect14.createStatement();
			sql14 = "select name from students\r\n where snum in (select snum from register where regtime = \"Fall2020\");";
			stmt14.executeQuery(sql14);
			
			stmt15 = connect15.createStatement();
			sql15 = "select number, name from courses where department_code in (select code from departments where name = \"Computer Science\");";
			stmt15.executeQuery(sql15);
			
			stmt16 = connect16.createStatement();
			sql16 = "select number, name from courses where department_code in (select code from departments where name = \"Computer Science\" or name = \"Landscape Architect\");";
			stmt16.executeQuery(sql16);
			
			
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
				if(stmt4 != null) {
					stmt4.close();
				}
				if(stmt5 != null) {
					stmt5.close();
				}
				if(stmt6 != null) {
					stmt6.close();
				}
				if(stmt7 != null) {
					stmt7.close();
				}
				if (stmt8 != null) {
					stmt8.close();
				}
				if(stmt9 != null) {
					stmt9.close();
				}
				if(stmt10 != null) {
					stmt10.close();
				}
				if(stmt11 != null) {
					stmt11.close();
				}
				if(stmt12 != null) {
					stmt12.close();
				}
				if(stmt13 != null) {
					stmt13.close();
				}
				if(stmt14 != null) {
					stmt14.close();
				}
				if(stmt15 != null) {
					stmt15.close();
				}
				if(stmt16 != null) {
					stmt16.close();
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
				if (connect4 != null) {
					connect4.close();
				}
				if (connect5 != null) {
					connect5.close();
				}
				if (connect6 != null) {
					connect6.close();
				}
				if (connect7 != null) {
					connect7.close();
				}
				if (connect8 != null) {
					connect8.close();
				}
				if (connect9 != null) {
					connect9.close();
				}
				if (connect10 != null) {
					connect10.close();
				}
				if (connect11 != null) {
					connect11.close();
				}
				if (connect12 != null) {
					connect12.close();
				}
				if (connect13 != null) {
					connect13.close();
				}
				if (connect14 != null) {
					connect14.close();
				}
				if (connect15 != null) {
					connect15.close();
				}
				if (connect16 != null) {
					connect16.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
