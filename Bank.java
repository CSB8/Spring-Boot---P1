package com.bank.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class Bank {
	
	public Bank(){
		
	}
	
	
	public Bank(int bid, String bname, String baccType, String bplace, List<Customer> customer) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.baccType = baccType;
		this.bplace = bplace;
		this.customer = customer;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bid;
	
	@Column
	private String bname;
	
	@Column
	private String baccType;
	
	@Column
	private String bplace;
	
	public int getBid() {
		return bid;
	}
	
	public void setBid(int bid) {
		this.bid = bid;
	}
	
	public String getBname() {
		return bname;
	}
	
	public void setBname(String bname) {
		this.bname = bname;
	}
	
	public String getBaccType() {
		return baccType;
	}
	
	public void setBaccType(String baccType) {
		this.baccType = baccType;
	}
	
	public String getBplace() {
		return bplace;
	}
	
	public void setBplace(String bplace) {
		this.bplace = bplace;
	}
	
	public List<Customer> getCustomer() {
		return customer;
	}
	
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	


	@Override
	public String toString() {
		return "Bank [bid=" + bid + ", bname=" + bname + ", baccType=" + baccType + ", bplace=" + bplace + ", customer="
				+ customer + "]";
	}



	@OneToMany(mappedBy="bank", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("bank")
	private List<Customer> customer;

}
