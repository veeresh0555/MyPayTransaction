package com.mypaytrans.model;

import java.util.List;

/**
 * @author veeru
 *
 */
public class Customerdetails {

	private long cid;
	

	private String cname;
	
	
	private long mobileno;
	
	private List<BankAccounts> baccounts;

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public List<BankAccounts> getBaccounts() {
		return baccounts;
	}

	public void setBaccounts(List<BankAccounts> baccounts) {
		this.baccounts = baccounts;
	}
	
	
	
}
