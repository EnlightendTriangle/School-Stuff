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
	public void ModifyRecords(){
		String connectionURL = "jdbc:mysql://localhost:3306/project1";
		 Connection connect = null;
		
		
		 Statement stmt = null;
		
		 String sql = "";
		
		
		try {			
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(connectionURL, "coms363", "password");
		
			stmt = connect.createStatement();
			sql = "update students set name = \"Scott\" where ssn = 746897816;";
			stmt.executeUpdate(sql);
			
			
			System.out.println("Your data records have successfully been modified.");
			 
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error with in modify records: "+ e.getMessage());
			e.printStackTrace();
		}
	}
	
	%>
		<%
		String button = request.getParameter("button1");
		out.println("Click Submit to modify records");

		if ("Submit".equals(button)) {
			ModifyRecords();
			String redirectURL = "ModifyRecordsResult.jsp";
			response.sendRedirect(redirectURL);
		}
	%>

	<form method="post">
		<input type="submit" name="button1" value="Submit" />

	</form>
</body>
</html>