package com.coforge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.coforge.entities.Customer;
import com.coforge.utils.DBUtils;

public class CustomerDao {
	
public java.util.List<Customer> getAllCustomers() throws ClassNotFoundException, SQLException {
	List<Customer> custList = new ArrayList<Customer>();
	String query = "select * from customer";
	Connection con = DBUtils.getConnection();
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(query);
	
	while(rs.next()) {
		Customer customer = new Customer();
		customer.setCustid(rs.getLong("custid"));
		customer.setCustname(rs.getString("custname"));
		customer.setAddress(rs.getString("address"));
		customer.setEmail(rs.getString("email"));
		customer.setMobile(rs.getString("mobile"));
		custList.add(customer);
	}
	rs.close();
	st.close();
	con.close();
	return custList;
}

public String addCustomer(Customer customer) throws ClassNotFoundException, SQLException {
	Connection con = DBUtils.getConnection();
	String query = "insert into customer value(?, ?, ?, ?, ?)"; 
	PreparedStatement ps = con.prepareStatement(query);
	ps.setLong(1, customer.getCustid());
	ps.setString(2, customer.getCustname());
	ps.setString(3, customer.getAddress());
	ps.setString(4, customer.getEmail());
	ps.setString(5, customer.getMobile());
	
	ps.executeUpdate();
	ps.close();
	con.close();
	return "Customer added successfully";
}

public Customer getCustomerById(long custId) throws ClassNotFoundException, SQLException {
	
	Connection con = DBUtils.getConnection();
	String qurey = "select * from customer where custid = ?";
	PreparedStatement ps = con.prepareStatement(qurey);
	ps.setLong(1, custId);
	
	ResultSet rs = ps.executeQuery();
	Customer customer = new Customer();
	while(rs.next()) {
		customer.setCustid(rs.getLong("custid"));
		customer.setCustname(rs.getString("custname"));
		customer.setAddress(rs.getString("address"));
		customer.setEmail(rs.getString("email"));
		customer.setMobile(rs.getString("mobile"));
	}
	return customer;
	
	///modification required if custid not found in db.
}


}
