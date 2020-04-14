package com.mypaytrans.model;

public class TransRequest {

	private long transid;
	
	private long fromaccount;
	
	private long toaccount;
	
	private long frmmobilenumber;
	
	private long tomobilenumber;
	
	private Double amount;
	
	private String transdate;
	
	private String comment;
	
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public long getTransid() {
		return transid;
	}

	public void setTransid(long transid) {
		this.transid = transid;
	}

	

	public String getTransdate() {
		return transdate;
	}

	public void setTransdate(String transdate) {
		this.transdate = transdate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public long getFromaccount() {
		return fromaccount;
	}

	public void setFromaccount(long fromaccount) {
		this.fromaccount = fromaccount;
	}

	public long getToaccount() {
		return toaccount;
	}

	public void setToaccount(long toaccount) {
		this.toaccount = toaccount;
	}

	public long getFrmmobilenumber() {
		return frmmobilenumber;
	}

	public void setFrmmobilenumber(long frmmobilenumber) {
		this.frmmobilenumber = frmmobilenumber;
	}

	public long getTomobilenumber() {
		return tomobilenumber;
	}

	public void setTomobilenumber(long tomobilenumber) {
		this.tomobilenumber = tomobilenumber;
	}
	
		
	
	
	
}
