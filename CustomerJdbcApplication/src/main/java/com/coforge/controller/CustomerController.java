package com.coforge.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import com.coforge.dao.CustomerDao;
import com.coforge.entities.Customer;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	private static CustomerDao dao = null;
    public CustomerController() {
        // TODO Auto-generated constructor stub
    }
    
    public void init() throws ServletException{
    	dao = new CustomerDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String action = request.getParameter("action");
		switch(action) {
		case "select" :
			try {
				getAllCustomers();
			}catch(ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		
		break;
		
		case "insert":
			String res = null;
			try {
				res = addCustomer();
				out.println("data retrieved on console...");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out.println(res);
			break;
			
		case "getbyid":
			try {
				out.println(getCustomerById());
			} catch(ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			break;
		}
	}
	
	public void getAllCustomers() throws ClassNotFoundException, SQLException {
		CustomerDao dao = new CustomerDao();
		List<Customer> customerList=dao.getAllCustomers();
		System.out.println(customerList);
	}
	
	public String addCustomer() throws ClassNotFoundException, SQLException {
		
		Customer customer = new Customer(274, "amit", "Banglore", "amit@gmail.com", "9090909090");
		return dao.addCustomer(customer);
	}
	
	public Customer getCustomerById() throws ClassNotFoundException, SQLException {
		return dao.getCustomerById(12333l);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
