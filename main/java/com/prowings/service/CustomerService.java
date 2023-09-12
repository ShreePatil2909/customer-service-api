package com.prowings.service;

import java.util.List;

import com.prowings.model.Customer;

public interface CustomerService {

	public Customer saveCustomer(Customer customer);
	
	public List<Customer> getCustomer();
	
	public Customer getByID(int id);
	
	public void deleteByID(int id);
	
	public List<Customer> cibilScoreOrder();
}
