package com.coforge;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
//import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//import java.util.*;

@WebServlet("/login")
public class login extends HttpServlet {
	
	
	
	private static final long serialVersionUID = 1L;

    public login() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");		
		
		boolean ispresent_username = UserData.username.contains(uname);
		boolean ispresent_password = UserData.password.contains(pwd);
		if(ispresent_username == true && ispresent_password == true) {
			RequestDispatcher rd = null;
			request.setAttribute("uname", uname);
			rd = request.getRequestDispatcher("/welcome.jsp");
			rd.forward(request, response);
		}
		else {
			out.println("user not present");
	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
