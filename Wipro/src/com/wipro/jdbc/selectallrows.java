package com.wipro.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class selectallrows{
	public static void main(String[]args) throws SQLException{
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "rohith");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("selct * from employee");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+".."+rs.getString(2)+".."+rs.getString(3)+".."+rs.getString(4));
			
		}
		con.close();
	}





}
