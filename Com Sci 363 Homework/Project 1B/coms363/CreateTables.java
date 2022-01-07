package coms363;

import java.sql.*;
public class CreateTables {
	private static Connection connect = null;
	private static Connection connect2 = null;
	private static Connection connect3 = null;
	private static Connection connect4 = null;
	private static Connection connect5 = null;
	private static Connection connect6 = null;
	private static Connection connect7 = null;

	public static void main(String[] args) 
	{

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
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		try {
			
			stmt.executeBatch();
			stmt2.executeBatch();
			stmt3.executeBatch();
			stmt4.executeBatch();
			stmt5.executeBatch();
			stmt6.executeBatch();
			stmt7.executeBatch();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
