package com.coforge;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public signup() {
       
    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		String mno = request.getParameter("mno");
		
		UserData.username.add(uname);
		UserData.password.add(pwd);
		
		UserData.showAllUsers();
		
			RequestDispatcher rd = null;
			request.setAttribute("uname", uname);
			request.setAttribute("email", email);
			request.setAttribute("mno", mno);
			rd = request.getRequestDispatcher("/successSignUp.jsp");
			rd.forward(request, response);
			
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
