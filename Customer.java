package com.bank.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="emp")
public class Customer {
	
	public Customer() {
		
	}
	
	public Customer(int cid, String cName, Bank bank) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.bank = bank;
	}


    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	
	@Column
	private String cName;
	
	
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}


	

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cName=" + cName + ", bank=" + bank + "]";
	}



	@ManyToOne
	@JoinColumn(name="bid")
	@JsonIgnoreProperties("customer")
	Bank bank;
	

	
}
