package com.mypaytrans.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mypaytrans.feignclient.TransactionClient;
import com.mypaytrans.model.TransRequest;
import com.mypaytrans.model.TransactionHistory;
import com.mypaytrans.service.TransactService;

@RestController
@RequestMapping("/mypaytrans")
public class MypayController {

	@Autowired
	TransactService transService;
	
	@Autowired
	TransactionClient transclient;
	
	@PostMapping("/savetrans")
	public ResponseEntity<TransactionHistory> savetrans(TransRequest transreq) {
		TransactionHistory savetrans=transService.savetransdata(transreq);
		return new ResponseEntity<>(savetrans,new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/{frmmobilenumber}")
	public ResponseEntity<List<TransactionHistory>> getbalstatement(@PathVariable("frmmobilenumber") long frmmobilenumber){
		List<TransactionHistory> toptenstatement=transService.findAllByfromMobile(frmmobilenumber);
		toptenstatement.stream().forEach(slist->System.out.println("From MobileNumber: "+slist.getFrmmobilenumber()+"\t ToMobileNumber: "+slist.getTomobilenumber()+"\t date Of Transaction: "+slist.getTransdate()));
		return new ResponseEntity<List<TransactionHistory>>(toptenstatement,new HttpHeaders(),HttpStatus.OK);
	}
	
	
}
