package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.daos.CustomerDao;
import com.coforge.entities.Customer;
import com.coforge.exceptions.CustomerNotFoundException;

@Service
public class CustomerService implements CustomerServiceInterface{
	
	@Autowired
	private CustomerDao dao;

	@Override
	public List<Customer> getAllCustomer() {
		
		return dao.getAllCustomer();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		
		return dao.saveCustomer(customer);
	}

	@Override
	public Customer getCustomerById(long id) {
		
		return dao.getCustomerById(id).orElseThrow(()->new CustomerNotFoundException("no customer found with this id :"+id));
	}

	@Override
	public Customer updateCustomer(Customer customer, long cid) {
		
		Customer exCustomer=dao.getCustomerById(cid).orElseThrow(()->
		new RuntimeException());
			exCustomer.setCname(customer.getCname());
			exCustomer.setAddress(customer.getAddress());
			exCustomer.setMobile(customer.getMobile());
			exCustomer.setEmail(customer.getEmail());
			return dao.updateCustomer(exCustomer);
	}

	@Override
	public void deleteCustomer(long cid) {
		Customer exCustomer=dao.getCustomerById(cid).orElseThrow(()->new RuntimeException());
			dao.deleteCustomer(cid);
			System.out.println("customer deleted successfully");
		
			
		
	}

}
