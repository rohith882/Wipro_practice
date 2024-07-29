package Servelt;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Account
 */
@WebServlet("/Account")
public class Account extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String x = request.getParameter("t1");
		int accountNumber = Integer.parseInt(x);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "system", "rohith");
			PreparedStatement ps = con.prepareStatement("select bal from 111 where accno=?");
			ps.setInt(1, accountNumber);
			ResultSet rs = ps.executeQuery();
			PrintWriter pw = response.getWriter();
			if(rs.next()) {
				pw.println("<h1>");
				pw.println("<a href='account.html'>cilck</a>");
			}
			else {
				pw.println("<h1>something went wrong, kindly check your account number</h1>");
				pw.println("<a href='account.html'>click</a>");
			}
		}catch (Exception e) {
			System.out.println(e);
			}
			
			
		}
	}

