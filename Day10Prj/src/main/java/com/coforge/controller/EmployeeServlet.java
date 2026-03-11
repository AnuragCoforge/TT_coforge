package com.coforge.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;

import com.coforge.dao.EmployeeDAO;
import com.coforge.models.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeDAO dao;

    /**
     * Default constructor. 
     */
    public EmployeeServlet() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
    	dao=new EmployeeDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=request.getParameter("action");
		PrintWriter out=response.getWriter();
		switch(action) {
		case "list":
			List<Employee> empList=dao.getAllEmployees();
			request.setAttribute("empList", empList);
			RequestDispatcher rd=request.getRequestDispatcher("employee-list.jsp");
			rd.forward(request, response);
			break;
		case "new":
			rd=request.getRequestDispatcher("employee-form.jsp");
			rd.forward(request, response);
			break;
		case "edit":
			long eid=Long.parseLong(request.getParameter("eid"));
			Employee emp=dao.getEmployeeById(eid);
			request.setAttribute("employee", emp);
			rd=request.getRequestDispatcher(("employee-form.jsp"));
			rd.forward(request, response);
			break;
		default:
			out.println("no action selected");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String eid=request.getParameter("eid");
		String ename=request.getParameter("ename");
		double salary=Double.parseDouble(request.getParameter("salary"));
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		LocalDate doj=LocalDate.parse(request.getParameter("doj"));
		LocalDate dob=LocalDate.parse(request.getParameter("dob"));
		
		if(eid==null || eid.isEmpty()) {
			Employee e=new Employee(ename,salary,email,mobile,doj,dob);
			dao.addEmployee(e);
		} else {
			long empid=Long.parseLong(eid);
			Employee emp=new Employee(empid,ename,salary,email,mobile,doj,dob);
			dao.updateEmployee(emp);
		}
		response.sendRedirect("employee?action=list");
		
	}
	

}
