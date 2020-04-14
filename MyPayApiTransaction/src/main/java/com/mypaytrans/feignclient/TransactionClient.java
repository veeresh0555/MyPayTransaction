package com.mypaytrans.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mypaytrans.model.BankAccounts;
import com.mypaytrans.model.Customerdetails;
import com.mypaytrans.model.TransRequest;

@FeignClient(name="http://bankservice/customerbank")
public interface TransactionClient {

	@GetMapping("/info")
	public String info();
	
	@GetMapping("/listofac")
	public ResponseEntity<List<BankAccounts>> getAllBankDetails();
	
	@GetMapping("/listofcustomers")
	public ResponseEntity<List<Customerdetails>> getAllAccounts();
	
	@PostMapping("/checktransreq")
	public ResponseEntity<Customerdetails> checktransRequest(@RequestBody TransRequest transreq);
	
}
