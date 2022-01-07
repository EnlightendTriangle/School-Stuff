<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*, java.util.*,java.sql.*" %>
<%@ page import="javax.servlet.http.*, javax.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%!
	public void insertRecords(){
		String connectionURL = "jdbc:mysql://localhost:3306/project1";
		 Connection connect = null;
		 Connection connect2 = null;
		 Connection connect3 = null;
		 Connection connect4 = null;
		 Connection connect5 = null;
		 Connection connect6 = null;
		 Connection connect7 = null;

		
		 Statement stmt = null;
		 Statement stmt2 = null;
		 Statement stmt3 = null;
		 Statement stmt4 = null;
		 Statement stmt5 = null;
	     Statement stmt6 = null;
		 Statement stmt7 = null;
		 
		 String sql = "";
		 String sql2 = "";
		 String sql3 = "";
		 String sql4 = "";
		 String sql5 = "";
		 String sql6 = "";
		 String sql7 = "";
		
		try {			
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(connectionURL, "coms363", "password");
			connect2 =  DriverManager.getConnection(connectionURL, "coms363", "password");
			connect3 =  DriverManager.getConnection(connectionURL, "coms363", "password");
			connect4 =  DriverManager.getConnection(connectionURL, "coms363", "password");
			connect5 =  DriverManager.getConnection(connectionURL, "coms363", "password");
			connect6 =  DriverManager.getConnection(connectionURL, "coms363", "password");
			connect7 =  DriverManager.getConnection(connectionURL, "coms363", "password");

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
			
			System.out.println("Your data records have successfully been inserted.");
			 
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error with in insert record: "+ e.getMessage());
			e.printStackTrace();
		}
	}
	
	%>
		<%
		String button = request.getParameter("button1");
		out.println("Click Submit to insert data records");

		if ("Submit".equals(button)) {
			insertRecords();
			String redirectURL = "InsertRecordsResult.jsp";
			response.sendRedirect(redirectURL);
		}
	%>

	<form method="post">
		<input type="submit" name="button1" value="Submit" />

	</form>
</body>
</html>