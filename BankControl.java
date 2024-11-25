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
import com.bank.serviceimple.BankSerImp;

@RestController
@RequestMapping("/mapme2")
public class BankControl {
	
	@Autowired
	private BankSerImp bc;
	
	@PostMapping("/saveme")
	public String savebank(@RequestBody Bank bank) {
		bc.savebank(bank);
		return "created";
	}
	
	@GetMapping("/getme")
	public List<Bank> getbank() {
		List<Bank> b=bc.getbank();
		return b;
	}
	
	@PutMapping("/upme")
	public String updbank(@RequestBody Bank bank) {
		// TODO Auto-generated method stub
		bc.savebank(bank);
		return "updated";
	}
	
	@DeleteMapping("/delme/{bid}")
	public String delbank(@PathVariable("bid") int bid) {
		// TODO Auto-generated method stub
		bc.delbank(bid);
		return "deleted";
	}

}
