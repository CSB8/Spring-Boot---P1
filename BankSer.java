package com.bank.service;
import java.util.*;
import com.bank.entities.Bank;

public interface BankSer {
	
	public String savebank(Bank bank);
	List<Bank> getbank();
	public String updbank(Bank bank);
	public String delbank(int bid);
	
	
	

}
