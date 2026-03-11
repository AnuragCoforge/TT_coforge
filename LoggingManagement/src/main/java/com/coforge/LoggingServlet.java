package com.coforge;

import java.io.IOException;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@WebServlet("/LoggingServlet")
public class LoggingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger= LogManager.getLogger(LoggingServlet.class);

    public LoggingServlet() {
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String clientIp = request.getRemoteAddr();
		String header = request.getHeader("User-Agent");
		String method = request.getMethod();
		
		logger.info("Form Submitted At {}", LocalDate.now());
		logger.info("UserName: {}", uname);
		logger.info("Client IP {}", clientIp);
		logger.info("User Agent {}", header);
		logger.info("Request Method {}", method);
		sayHello();
	}

	public void sayHello() {
		logger.info("sayhello started at {}", LocalDate.now());
		logger.info("printing hello msg");
		System.out.println("hello");
		logger.info ("sayhello completed at {}", LocalDate.now());
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

