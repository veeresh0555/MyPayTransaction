package com.mypaytrans.service;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mypaytrans.feignclient.TransactionClient;
import com.mypaytrans.model.Customerdetails;
import com.mypaytrans.model.TransRequest;
import com.mypaytrans.model.TransactionHistory;
import com.mypaytrans.repository.MyPayTransRepository;

@Service
public class TransactServiceImpl implements TransactService {
	
	@Autowired
	MyPayTransRepository mypayRepository;
	
	@Autowired
	TransactionClient transclient;
	
	@Override
	public TransactionHistory savetransdata(TransRequest transrequest){
		ResponseEntity<Customerdetails> okstatus=transclient.checktransRequest(transrequest);
		TransactionHistory trans=new TransactionHistory();
		try {
		if(okstatus.getBody().getCid()>0) {
			trans.setTransid(transrequest.getTransid());
			trans.setFrmmobilenumber(transrequest.getFrmmobilenumber());
			trans.setTomobilenumber(transrequest.getTomobilenumber());
			trans.setComment(transrequest.getComment());
			String sDate1=transrequest.getTransdate();
			java.util.Date sdate = null;
			sdate = new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
			trans.setTransdate(sdate);
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mypayRepository.save(trans);
	}

	@Override
	public List<TransactionHistory> findAllByfromMobile(long frmmobilenumber) {
		List<TransactionHistory> ministmt=mypayRepository.findBymobileno(frmmobilenumber);
		return ministmt;
	}

}
