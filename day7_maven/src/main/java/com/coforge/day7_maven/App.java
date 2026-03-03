package com.coforge.day7_maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
        
        Statement st = con.createStatement();
        String query = "select * from student";
        ResultSet rs = st.executeQuery(query);  //result set is a buffer where entire selected record and placed in a schema based
        
        //we have to iterate to the buffer.
        
        ArrayList<String> s = new ArrayList<>();

        while(rs.next()) {
        	System.out.println("Student Id: " + rs.getInt(1));
        	System.out.println("Student Name: " + rs.getString(2));   
        	s.add(rs.getString(2));
        	System.out.println("Marks: " + rs.getDouble(3));          
        	System.out.println("Mobile Number: "+ rs.getString(4));
            System.out.println("--------------------");

        }
        System.out.println(s);
    
    }
}