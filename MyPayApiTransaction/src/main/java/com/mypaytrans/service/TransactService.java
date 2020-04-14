package com.mypaytrans.service;

import java.util.List;

import com.mypaytrans.model.TransRequest;
import com.mypaytrans.model.TransactionHistory;

public interface TransactService {

	TransactionHistory savetransdata(TransRequest trans);

	List<TransactionHistory> findAllByfromMobile(long frmmobilenumber);

}
