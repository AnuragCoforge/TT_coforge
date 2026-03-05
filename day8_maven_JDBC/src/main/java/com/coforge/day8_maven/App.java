package com.coforge.day8_maven;

import java.sql.CallableStatement;
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
public class App {
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
        
        String query = "{call get_all_students()}";
        CallableStatement cs = con.prepareCall(query);
        
        ResultSet rs = cs.executeQuery();
        
        System.out.println("result from procedures through JDBC: ");
        
        while(rs.next()) {
        	
        	System.out.println(rs.getDouble(1));
        	System.out.println(rs.getString(2));   
        	System.out.println(rs.getDouble(3));          
        	System.out.println(rs.getString(4));
            System.out.println("--------------------");
        }

    }
}