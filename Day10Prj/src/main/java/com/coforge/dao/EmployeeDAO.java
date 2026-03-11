package com.coforge.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.coforge.models.Employee;
import com.coforge.util.DBUtil;

public class EmployeeDAO {
	
	public List<Employee> getAllEmployees() {
		Statement st=null;
		ResultSet rs=null;
		String query="select * from employees";
		List<Employee> empList=new ArrayList<Employee>();
		
		try(Connection conn=DBUtil.getConnection()) {
			st=conn.createStatement();
			rs=st.executeQuery(query);
		
			while(rs.next()) {
				Employee e=new Employee();
				e.setEid(rs.getLong("eid"));
				e.setEname(rs.getString("ename"));
				e.setSalary(rs.getDouble("salary"));
				e.setEmail(rs.getString("email"));
				e.setMobile(rs.getString("mobile"));
				e.setDoj(rs.getDate("doj").toLocalDate());
				e.setDob(rs.getDate("dob").toLocalDate());
				empList.add(e);
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;		
	}
	
	public void addEmployee(Employee employee) {
		String query="insert into employees (ename, salary, email, mobile, doj, dob) values(?,?,?,?,?,?)";
		try(Connection conn=DBUtil.getConnection();
			PreparedStatement ps=conn.prepareStatement(query)) {
			
			//ps.setLong(1, employee.getEid());
			ps.setString(1, employee.getEname());
			ps.setDouble(2, employee.getSalary());
			ps.setString(3, employee.getEmail());
			ps.setString(4, employee.getMobile());
			ps.setDate(5, java.sql.Date.valueOf(employee.getDoj()));
			ps.setDate(6, java.sql.Date.valueOf(employee.getDob()));
			ps.executeUpdate();
			System.out.println("row inserted");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
	}
	
	public void updateEmployee(Employee employee) throws ClassNotFoundException, SQLException {
		String query =
			    "UPDATE employees " +
			    "SET ename = ?, salary = ?, email = ?, mobile = ?, doj = ?, dob = ? " +
			    "WHERE eid = ?";
 
			try(Connection conn = DBUtil.getConnection();
					PreparedStatement ps = conn.prepareStatement(query)) {
				
				ps.setString(1, employee.getEname());
			    ps.setDouble(2, employee.getSalary()); 
			    ps.setString(3, employee.getEmail());
			    ps.setString(4, employee.getMobile());
			    
			    ps.setDate(5, java.sql.Date.valueOf(employee.getDoj()));
			    ps.setDate(6, java.sql.Date.valueOf(employee.getDob()));
			 
			    ps.setLong(7, employee.getEid());
			    
			    int rows = ps.executeUpdate();
			    System.out.println(rows + " row(s) updated");
			} catch (ClassNotFoundException | SQLException e) {
			    e.printStackTrace();
			}
		}
		
	
	
	public void DeleteById(long eid) {
		String query = "delete from employees where eid = ?";
		
        try(Connection conn=DBUtil.getConnection();
    		PreparedStatement ps=conn.prepareStatement(query)) {
        	
            ps.setLong(1, eid);
            ps.executeUpdate();
            System.out.println("row deleted!");
    			
    		} catch (ClassNotFoundException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    			
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		
    		}
	}
	
	public Employee getEmployeeById(long eid) throws SQLException, ClassNotFoundException {
		String sql = "SELECT eid, ename, salary, email, mobile, doj, dob FROM employees WHERE eid = ?";
		 
	    try (Connection con = DBUtil.getConnection();
	         PreparedStatement ps = con.prepareStatement(sql)) {
 
	        ps.setLong(1, eid);
 
	        try (ResultSet rs = ps.executeQuery()) {
	            if (rs.next()) {
	                Employee emp = new Employee();
	                emp.setEid(rs.getLong("eid"));
	                emp.setEname(rs.getString("ename"));
	                emp.setSalary(rs.getDouble("salary"));
	                emp.setEmail(rs.getString("email"));
	                emp.setMobile(rs.getString("mobile"));
 
	                java.sql.Date dojSql = rs.getDate("doj");
	                emp.setDoj(dojSql != null ? dojSql.toLocalDate() : null);
 
	                java.sql.Date dobSql = rs.getDate("dob");
	                emp.setDob(dobSql != null ? dobSql.toLocalDate() : null);
 
	                return emp;
	            }
	        }
	    }
	    return null; // not found
	}

}
