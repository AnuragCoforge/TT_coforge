package com.coforge.day8_maven;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class ProcedureSqlCalculator {

	 public static void main(String[] args) throws ClassNotFoundException, SQLException {

       Class.forName("com.mysql.cj.jdbc.Driver");
       System.out.println("Driver loaded");
       
       String uname = "root";
       String password = "Cfg@1234";
       
       String url = "jdbc:mysql://localhost:3306/cfgdb";
       
       Connection con = DriverManager.getConnection(url, uname, password);
       System.out.println("Connection Estabilished");
       
       System.out.println("-----------------------------------------------------------------------------");
       
       String query = "{call add_numbers(?, ?, ?)}";
       CallableStatement cs = con.prepareCall(query);  //parses the query...
       
       cs.setInt(1, 34);
       cs.setInt(2, 67);
       cs.registerOutParameter(3, Types.INTEGER);  //to set the datatype for result
       
       cs.execute();
       int sum = cs.getInt(3);
       
       System.out.println("result from procedures through JDBC: ");
       
       System.out.println("Addition of two numbers: " + sum);
      

   }
}
