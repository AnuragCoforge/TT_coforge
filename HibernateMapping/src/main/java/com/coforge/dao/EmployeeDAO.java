package com.coforge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.coforge.entities.Employee;
import com.coforge.utils.HibernateUtil;

public class EmployeeDAO {
	
	public List<Employee> getAllEmployee() {
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.createQuery("From Employee", Employee.class).list();
		}
	}
	
	public void insertEmployee(Employee employee) {
		Transaction tx = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			tx = session.beginTransaction();
			session.persist(employee);
			tx.commit();
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}
	
	public Employee getEmployeeById(long eid) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.get(Employee.class, eid);
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
//	@SuppressWarnings("deprecation")
	public void deleteEmployee(long eid) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			Transaction tx = session.beginTransaction();
			session.remove(getEmployeeById(eid));
			tx.commit();
			System.out.println("employee deleted");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//update employee dao code
	
	public void updateEmployee(Employee employee) {
		Transaction tx = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			tx = session.beginTransaction();
			session.merge(employee);
			tx.commit();
			System.out.println("Employee Update Successfully");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
