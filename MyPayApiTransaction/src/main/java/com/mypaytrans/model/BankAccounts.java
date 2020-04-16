package com.mypaytrans.model;

public class BankAccounts {
	private Long acno;
	private Customerdetails customer;
	
	private Double balance;

	public Long getAcno() {
		return acno;
	}

	public void setAcno(Long acno) {
		this.acno = acno;
	}

	public Customerdetails getCustomer() {
		return customer;
	}

	public void setCustomer(Customerdetails customer) {
		this.customer = customer;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
}
