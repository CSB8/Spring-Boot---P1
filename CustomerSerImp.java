package com.bank.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.entities.Customer;
import com.bank.repositary.CustomerRep;
import com.bank.service.CustomerSer;

@Service
public class CustomerSerImp implements CustomerSer{
	
	@Autowired
	private CustomerRep cRep;

	@Override
	public String saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		cRep.save(customer);
		return "inserted";
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return cRep.findAll();
	}


	@Override
	public String updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		cRep.save(customer);
		return "updated";
	}

	@Override
	public void deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		cRep.deleteById(cid);
		
	}

}
