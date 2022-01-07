<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*, java.util.*,java.sql.*" %>
<%@ page import="javax.servlet.http.*, javax.servlet.*" %>
<%

try {
Class.forName("com.mysql.jdbc.Driver");
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
String connectionURL = "jdbc:mysql://localhost:3306/project1";
Connection connect = null;

Statement stmt = null;
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<h2 align="center"><font><strong>This is the result of query 1</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
<tr bgcolor="#A52A2A">
<td><b>snum</b></td>
<td><b>ssn</b></td>
</tr>
<%
try{ 
connect = DriverManager.getConnection(connectionURL, "coms363", "password");
statement=connect.createStatement();
String sql ="SELECT snum, ssn FROM students where name = \"Becky\"";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="#DEB887">

<td><%=resultSet.getString("snum") %></td>
<td><%=resultSet.getString("ssn") %></td>
</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>>