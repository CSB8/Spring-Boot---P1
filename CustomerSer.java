package com.bank.service;

import java.util.List;

import com.bank.entities.Customer;

public interface CustomerSer {
	
	public String saveCustomer(Customer customer);
	
	List<Customer> getAllCustomers();
	
	public String updateCustomer(Customer customer);
	
	void deleteCustomer(int cid);
	
	

}
