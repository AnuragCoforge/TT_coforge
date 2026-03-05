package com.coforge.day8_maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Hello world!
 */
public class UpdateQueryCode {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        System.out.println("");
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
        
        String uname = "root";
        String password = "Cfg@1234";
        
        String url = "jdbc:mysql://localhost:3306/cfgdb";
        
        Connection con = DriverManager.getConnection(url, uname, password);
        System.out.println("Connection Estabilished");
        
        System.out.println("-----------------------------------------------------------------------------");
        
        //insertion query
        
        String query = "update student set marks = ? where studid = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setDouble(1, 85);
        ps.setInt(2, 322);
        ps.executeUpdate();
        System.out.println("row Updated");
        
        
        Statement st = con.createStatement();
        String query2 = "select * from student";
        ResultSet rs = st.executeQuery(query2);  //result set is a buffer where entire selected record and placed in a schema based
        ResultSetMetaData rsmd = rs.getMetaData();
        int count = rsmd.getColumnCount();
        
        System.out.println("Schema");
        System.out.println("----------------------------");
        for(int i=1 ; i <= count ; i++) { // SQL is 1-based indexing
        	System.out.println(rsmd.getColumnName(i) + "------" + rsmd.getColumnTypeName(i));
        }
        //we have to iterate to the buffer.
        

        System.out.println("----------------------------");
        while(rs.next()) {
        	System.out.println("Student Id: " + rs.getInt(rsmd.getColumnName(1)));
        	System.out.println("Student Name: " + rs.getString(rsmd.getColumnName(2)));   

        	System.out.println("Marks: " + rs.getDouble(rsmd.getColumnName(3)));          
        	System.out.println("Mobile Number: "+ rs.getString(rsmd.getColumnName(4)));
            System.out.println("--------------------");
        }

    }
}