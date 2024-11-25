package com.bank.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.entities.Bank;

public interface BankRep extends JpaRepository<Bank, Integer>{

}
