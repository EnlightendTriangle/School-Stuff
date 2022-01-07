package coms363;

import java.sql.*;
public class InsertRecords {
	private static Connection connect = null;
	private static Connection connect2 = null;
	private static Connection connect3 = null;
	private static Connection connect4 = null;
	private static Connection connect5 = null;
	private static Connection connect6 = null;
	private static Connection connect7 = null;

	public static void main(String[] args) 
	{
		String sql = "";
		String sql2 = "";
		String sql3 = "";
		String sql4 = "";
		String sql5 = "";
		String sql6 = "";
		String sql7 = "";
		
		

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
			
		} catch(Exception e) {

		}

		Statement stmt = null;
		Statement stmt2 = null;
		Statement stmt3 = null;
		Statement stmt4 = null;
		Statement stmt5 = null;
		Statement stmt6 = null;
		Statement stmt7 = null;
		
		try {
			stmt = connect.createStatement();
			
			sql = "INSERT INTO students values row (1001, 654651234, 'Randy', 'M', 20001201, '301 E Hall', 5152700988, '121 Main', 7083066321)";
			stmt.executeUpdate(sql);
			sql =  "INSERT INTO students values row (1002, 123097834, 'Victor', 'M', 20000506, '270 W Hall', 5151234578, '702 Walnut', 7080366333)";
		    stmt.executeUpdate(sql);
			sql =  "INSERT INTO students values row (1003, 978012431, 'John', 'M', 19990708, '201 W Hall', 5154132805, '888 University', 5152012011)";
			stmt.executeUpdate(sql);
			sql =   "INSERT INTO students values row (1004, 746897816, 'Seth', 'M', 19981230, '199 N Hall', 5158891504, '21 Green', 5154132907)";
			stmt.executeUpdate(sql);
			sql =  "INSERT INTO students values row (1005, 186032894, 'Nicole', 'F', 20010401, '178 S Hall', 5158891155, '13 Gray', 5157162071)";
			stmt.executeUpdate(sql);
			sql =  "INSERT INTO students values row (1006, 534218752, 'Becky', 'F', 20010516, '12 N Hall', 5157083698, '189 Clark', 2034367632)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO students values row (1007, 432609519, 'Kevin', 'M', 20000812, '75 E Hall', 5157082497, '89 National', 7182340772)";
			stmt.executeUpdate(sql);	
		
			stmt2 = connect2.createStatement();
			
			sql2 = "insert into departments (code, name, phone, college) values row (401, \"Computer Science\", \"5152982801\", \"LAS\"), row (402, \"Mathematics\", \"5152982802\", \"LAS\"), row (403, \"Chemical Engineering\", \"5152982803\", \"Engineering\"), row (404, \"Landscape Architect\", \"5152982804\", \"Design\")";
			stmt2.executeUpdate(sql2);
			
			stmt3 = connect3.createStatement();
			sql3 = "insert into degrees (name, level, department_code) values row (\"Computer Science\", \"BS\", 401), row (\"Software Engineering\", \"BS\", 401), row (\"Computer Science\", \"MS\", 401), row (\"Computer Science\", \"PhD\", 401), row (\"Applied Mathematics\", \"MS\", 402), row (\"Chemical Engineering\", \"BS\", 403), row (\"Landscape Architect\", \"BS\", 404);\r\n"; 
			stmt3.executeUpdate(sql3);		
			
			stmt4 = connect4.createStatement();
			sql4 = "insert into major (snum, name, level) values row (1001, \"Computer Science\", \"BS\"), row (1002, \"Software Engineering\", \"BS\"), row (1003, \"Chemical Engineering\", \"BS\"), row (1004, \"Landscape Architect\", \"BS\"), row (1005, \"Computer Science\", \"MS\"), row (1006, \"Applied Mathematics\", \"MS\"), row (1007, \"Computer Science\", \"PhD\");\r\n"; 
			stmt4.executeUpdate(sql4);
			
			
			stmt5 = connect5.createStatement();
			sql5 = "insert into minor (snum, name, level) values row (1007, \"Applied Mathematics\", \"MS\"), row (1005, \"Applied Mathematics\", \"MS\"), row (1001, \"Software Engineering\", \"BS\");\r\n";
			stmt5.executeUpdate(sql5);
			
			
			stmt6 = connect6.createStatement();
			sql6 = "insert into courses (number, name, description, credithours, level, department_code) values row (113, \"Spreadsheet\", \"Microsoft Excel and Access\", 3, \"Undergraduate\", 401), row (311, \"Algorithm\", \"Design and Analysis\", 3, \"Undergraduate\", 401), row (531, \"Theory of Computation\", \"Theorem and Probability\", 3, \"Graduate\", 401), row (363, \"Database\", \"Design Principle\", 3, \"Undergraduate\", 401), row (412, \"Water Management\", \"Water Management\", 3, \"Undergraduate\", 404), row (228, \"Special Topics\", \"Interesting Topics about CE\", 3, \"Undergraduate\", 403), row (101, \"Calculus\", \"Limit and Derivative\", 4, \"Undergraduate\", 402);\r\n";
			stmt6.executeUpdate(sql6);
			
			
			stmt7 = connect7.createStatement();
			sql7 = "insert into register (snum, course_number, regtime, grade) values row (1001, 363, \"Fall2020\",3), row (1002, 311, \"Fall2020\", 4), row (1003, 228, \"Fall2020\", 4), row (1004, 363, \"Spring2021\", 3), row (1005, 531, \"Spring2021\", 4), row (1006, 363, \"Fall2020\", 3), row (1007, 531, \"Spring2021\", 4)";
			stmt7.executeUpdate(sql7);
			
			
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
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
