package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entities.Bank;
import com.bank.entities.Customer;
import com.bank.serviceimple.CustomerSerImp;

@RestController
@RequestMapping("/mapme1")
public class CustomerControl {
	
	@Autowired
	private CustomerSerImp cc;
	
	@PostMapping("/lockme")
	public String saveCustomer(@RequestBody Customer customer) {
		// TODO Auto-generated method stub
		return cc.saveCustomer(customer);
	}
	
	@GetMapping("/listme")
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return cc.getAllCustomers();
	}
	
	@PutMapping("/newme")
	public String updateCustomer(@RequestBody Customer customer) {
		// TODO Auto-generated method stub
		cc.updateCustomer(customer);
		return "updated";
	}
	
	
	@DeleteMapping("/killme/{cid}")
	public void deleteCustomer(@PathVariable("cid") int cid) {
		// TODO Auto-generated method stub
		cc.deleteCustomer(cid);
		
	}

}
