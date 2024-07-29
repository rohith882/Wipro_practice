package com.wipro.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.lang.ClassNotFoundException;

public class transactionmanagement {
	public static void main(String[]args) throws Exception{
		Class.forName("oracle.jdbc.driver.oracleDriver");
		Connection con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:Xe", "system", "rohith");
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		st.addBatch("update rama set bal = bal-200 where accno=1000");
		st.addBatch("update sitha set bal = bal+200 where accno=1001");
		int x[]=st.executeBatch();
		if(x[0]>0&x[1]>0) {
			con.commit();
			System.out.println("funds transfered successfully, have a good day");
		}
		else {
			System.out.println("somenthing went wrong kindly check your account numbers");
		}
	}

}
