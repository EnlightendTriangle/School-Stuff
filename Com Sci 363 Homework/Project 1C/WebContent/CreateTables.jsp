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
	public void createTable(){
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
			stmt.addBatch("drop database if exists project1;");
			stmt.addBatch("create database project1;");
			stmt.addBatch("use project1;");
			stmt.addBatch("CREATE TABLE students (\r\n" + 
					"	snum INT,\r\n" + 
					"	ssn INTEGER,\r\n" + 
					"    name VARCHAR(10),\r\n" + 
					"    gender VARCHAR(1),\r\n" + 
					"    dob DATE, \r\n" + 
					"    c_addr VARCHAR(20),\r\n" + 
					"    c_phone VARCHAR(10),\r\n" + 
					"    p_addr VARCHAR(20),\r\n" + 
					"    p_phone VARCHAR(10),\r\n" + 
					"    PRIMARY KEY(ssn),\r\n" + 
					"    UNIQUE(snum)\r\n" + 
					");");
			
			stmt2 = connect2.createStatement();
			stmt2.addBatch("CREATE TABLE departments (\r\n" +
			"	code INT,\r\n" +
			"	name VARCHAR(50),\r\n" +
			"	phone VARCHAR(10),\r\n" +
			"	college VARCHAR(20),\r\n" +
			"	PRIMARY KEY(code),\r\n" +
			"   UNIQUE(name)\r\n" +
			");");
			
			stmt3 = connect3.createStatement();
			stmt3.addBatch("CREATE TABLE degrees (\r\n" +
			"	name VARCHAR(50),\r\n" +
			"	level VARCHAR(5),\r\n" +
			"	department_code INT,\r\n" +
			"   PRIMARY KEY(name, level),\r\n" +
			"	foreign key fk(department_code) references departments(code)\r\n" +
			");");
			
			stmt4 = connect4.createStatement();
			stmt4.addBatch("CREATE TABLE courses (\r\n" +
			"	number INT,\r\n" +
			"	name VARCHAR(50),\r\n" +
			"	description VARCHAR(50),\r\n" +
			"	credithours INT,\r\n" +
			"	level VARCHAR(20),\r\n" +
			"	department_code INT, \r\n" +
			"	PRIMARY KEY(number),\r\n" +
			"   UNIQUE(name),\r\n" +
			"   foreign key fk(department_code) references departments(code)\r\n" +
			");");
			
			stmt5 = connect5.createStatement();
			stmt5.addBatch("CREATE TABLE register (\r\n" +
			"	snum INT,\r\n" +
			"	course_number INT,\r\n" +
			"	regtime VARCHAR(10),\r\n" +
			"	grade INT,\r\n" +
			"	PRIMARY KEY(snum, course_number),\r\n" +
			"   foreign key fk(snum) references students(snum),\r\n" +
			"   foreign key f_k(course_number) references courses(number)\r\n" +
			");");
			
			stmt6 = connect6.createStatement();
			stmt6.addBatch("CREATE TABLE major (\r\n" +
			"	snum INT,\r\n" +
			"	name VARCHAR(50),\r\n" +
			"	level VARCHAR(5),\r\n" +
			"	PRIMARY KEY(snum, name, level),\r\n" +
			"   foreign key fk(snum) references students(snum),\r\n" +
			"   foreign key f_k(name, level) references degrees(name, level)\r\n" +
			");");
			
			stmt7 = connect7.createStatement();
			stmt7.addBatch("CREATE TABLE minor (\r\n" +
			"	snum INT,\r\n" +
			"	name VARCHAR(50),\r\n" +
			"	level VARCHAR(5),\r\n" +
			"	PRIMARY KEY(snum, name, level),\r\n" +
			"   foreign key fk(snum) references students(snum),\r\n" +
			"   foreign key f_k(name, level) references degrees(name, level)\r\n" +
			");");
			
			
			stmt.executeBatch();
			stmt2.executeBatch();
			stmt3.executeBatch();
			stmt4.executeBatch();
			stmt5.executeBatch();
			stmt6.executeBatch();
			stmt7.executeBatch();
			
			System.out.println("Tables have succesfully been created");
			 
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error with in create table: "+ e.getMessage());
			e.printStackTrace();
		}
	}
	
	%>
		<%
		String button = request.getParameter("button1");
		out.println("Click Submit To Make Tables");

		if ("Submit".equals(button)) {
			createTable();
			String redirectURL = "CreateTablesResult.jsp";
			response.sendRedirect(redirectURL);
		}
	%>

	<form method="post">
		<input type="submit" name="button1" value="Submit" />

	</form>
</body>
</html>