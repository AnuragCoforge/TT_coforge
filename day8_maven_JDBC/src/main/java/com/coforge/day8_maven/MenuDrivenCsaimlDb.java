package com.coforge.day8_maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


public class MenuDrivenCsaimlDb {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded");
        
        String uname = "root";
        String password = "Cfg@1234";
        
        String url = "jdbc:mysql://localhost:3306/cfgdb";
        
        Connection con = DriverManager.getConnection(url, uname, password);
        System.out.println("Connection Estabilished");
        
        Statement st = con.createStatement();
        
        //menu option module.
        System.out.println("Select from the Options given below: ");
        while(true)
        {
            System.out.println("1: insert the data");
            System.out.println("2: update the data");
            System.out.println("3: delete the data");
            System.out.println("4:  print the data");
            System.out.println("enter choice: ");
           
            int ch = sc.nextInt();
           
            switch(ch)
            {
            case 1 :
            	String query = "insert into csaiml values(?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(query);
                //entering the values one-by-one
                
                System.out.println("Enter the name: ");
                String name = sc.next();
                ps.setString(1, name);
                System.out.println("Enter the id: ");
                String id = sc.next();
                ps.setString(2, id);
                System.out.println("Enter the marks: ");
                String marks = sc.next();
                ps.setString(3, marks);
                System.out.println("Enter the mobile number: ");
                String mno = sc.next();
                ps.setString(4, mno);
                System.out.println("row inserted");
                ps.executeUpdate();
                break;
            case 2 :
            	String query2 = "update csaiml set marks = ? where id = ?";
                PreparedStatement ps2 = con.prepareStatement(query2);
                ps2.setInt(1, 85);
                ps2.setInt(2, 39);
                ps2.executeUpdate();
                System.out.println("row Updated");
                break;
            case 3:
            	String query3 = "delete from csaiml where id = ?";
                PreparedStatement ps3 = con.prepareStatement(query3);
                ps3.setInt(1, 48);
                ps3.executeUpdate();
                System.out.println("row deleted!");
               break;
                
            case 4:
            	 String query4 = "select * from csaiml";
                 ResultSet rs = st.executeQuery(query4);  //result set is a buffer where entire selected record and placed in a schema based
                 ResultSetMetaData rsmd = rs.getMetaData();
            	
                while(rs.next()) {
                	
                	System.out.println("Student Name: " + rs.getString(1));
                	System.out.println("Student Id: " + rs.getInt(2));   

                	System.out.println("Marks: " + rs.getInt(3));          
                	System.out.println("Mobile Number: "+ rs.getString(4));
                    System.out.println("--------------------");
                }
                break;
               
            default:
                System.out.println("wrong choice");

            }
            sc.close();
            
        }   
	}
}
