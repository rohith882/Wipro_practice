package com.wipro.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {
public static void main(String[] args) throws Exception {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		
		con.setAutoCommit(false);
		Statement st=con.createStatement();
		
		st.addBatch("update Patient set accbal=accbal-10000 where accno=1");
		st.addBatch("update Doctor set accbal=accbal+10000 where accno=2");
		
		
int x[]=st.executeBatch();
		
		if(x[0]>0&x[1]>0)
		{
			con.commit();
			System.out.println("funds transffered successfully, have a nice day");
		}
		else
		{
			con.rollback();
			System.out.println("something went wrong, kindly check your account numbers");
		}
}
}

