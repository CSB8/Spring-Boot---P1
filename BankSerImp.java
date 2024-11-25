package com.bank.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.entities.Bank;
import com.bank.repositary.BankRep;
import com.bank.service.BankSer;

@Service
public class BankSerImp implements BankSer{
	
	@Autowired
	private BankRep bRep;
	
	public BankSerImp(BankRep bRep) {
		super();
		this.bRep = bRep;
		
	}
	@Override
	public String savebank(Bank bank) {
		bRep.save(bank);
		return "created";
	}

	@Override
	public List<Bank> getbank() {
		List<Bank> b=bRep.findAll();
		return b;
	}
	
	@Override
	public String updbank(Bank bank) {
		// TODO Auto-generated method stub
		bRep.save(bank);
		return "updated";
	}

	@Override
	public String delbank(int bid) {
		// TODO Auto-generated method stub
		bRep.deleteById(bid);
		return "deleted";
	}
	
	
	

}
