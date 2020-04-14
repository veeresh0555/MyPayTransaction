package com.mypaytrans.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="transaction")
public class TransactionHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long transid;
	
	@Column(name="fmobilenumber")
	private long frmmobilenumber;
	
	@Column(name="tomobilenumber")
	private long tomobilenumber;
	
	@Column(name="description")
	private String comment;

	private Date transdate;
	
	private Double amount;

	public long getTransid() {
		return transid;
	}

	public void setTransid(long transid) {
		this.transid = transid;
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getTransdate() {
		return transdate;
	}

	public void setTransdate(Date transdate) {
		this.transdate = transdate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
	
	
	
	
	
}