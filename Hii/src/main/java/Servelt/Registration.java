package Servelt;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String x = request.getParameter("t1");
		String stuname = request.getParameter("t2");
		int stuid = Integer.parseInt(x);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "system", "rohith");
			PreparedStatement ps = con.prepareStatement("insert into stu values(?, ?)");
			ps.setInt(1,  stuid);
			ps.setString(2,  stuname);
			int result = ps.executeUpdate();
			
			PrintWriter pw = response.getWriter();
			if(result>0)
				pw.println("<h1>Registration sucessfully done</h1>");
			    pw.println("<ahref = 'Registration.html'>click</a>");
			    pw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
