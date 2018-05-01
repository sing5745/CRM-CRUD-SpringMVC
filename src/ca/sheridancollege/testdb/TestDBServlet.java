package ca.sheridancollege.testdb;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class TestDBServlet
 */
@WebServlet("/TestDBServlet")
public class TestDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = "springstudent";
		String password = "springstudent";
		
		String jdbc = "jdbc:mysql://localhost:3306/web_customer_tracker";
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			
			PrintWriter out = response.getWriter();
			out.println("Connecting to database " + jdbc);
			
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(jdbc,user,password);
			conn.close();
			
			
		}
		catch(Exception exc) {
			
		}
		
	}

}
