package com.coforge;

import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
//log is user defined msgs.

@WebFilter("/LoggingFilter")
public class LoggingFilter extends HttpFilter implements Filter {
       private static final Logger logger=LogManager.getLogger(LoggingFilter.class);
    public LoggingFilter() {
        super();
    }
    
	public void destroy() //req is comig out of filter.
	{
		logger.info("LoggingFilter Exit time {}", LocalDateTime.now());
		}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		
		String uri=req.getRequestURI();
		String method=req.getMethod();
		String ip=req.getRemoteAddr();
		logger.info("Incoming request-> Method: {}, URI: {} IP: {}");
	    long startTime=System.currentTimeMillis();
		chain.doFilter(request, response);
		long endTime=System.currentTimeMillis();
		logger.info("Response sent-> URI: Time Taken : {} ms", uri,(endTime));
	}

	public void init(FilterConfig fConfig) throws ServletException {
		logger.info("Logging filter starting time {}", LocalDateTime.now());
	}

}
