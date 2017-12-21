package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AggDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "system", "sapient123");
		String sql = "select sum(sal) totalsal , round(nvl(avg(sal),0),2) avgsal , count(eid) noofemp from sap_emp";
		PreparedStatement st = conn.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			System.out.println("sum =" + rs.getDouble("totalsal") );
			System.out.println("average = " + rs.getDouble("avgsal"));
			System.out.println("count =" + rs.getInt("noofemp"));

		}
		conn.close();

	}

}
