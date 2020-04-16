package com.mypaytrans.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.mypaytrans.model.TransactionHistory;

@Repository
public interface MyPayTransRepository extends JpaRepository<TransactionHistory, Long> {
	
	@Query("select frmmobilenumber,tomobilenumber,amount,transdate,comment from TransactionHistory where frmmobilenumber=:frmmobilenumber")
	public List<TransactionHistory> findBymobileno(@Param("frmmobilenumber")long frmmobilenumber);

	
	
	
	
}
