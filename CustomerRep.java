package com.bank.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.entities.Customer;

public interface CustomerRep extends JpaRepository<Customer, Integer>{

}
