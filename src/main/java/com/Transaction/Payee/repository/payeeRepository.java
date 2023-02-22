package com.Transaction.Payee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Transaction.Payee.entity.BankingEntity;
import com.Transaction.Payee.entity.Payee;

@Repository
public interface payeeRepository extends JpaRepository<Payee, String>{

	Payee findById(int id);
	
	void deleteById(int id);
	
	Payee findByAccHolderName(String accHolderName);
	
	@Modifying
    @Query(value="SELECT * FROM bankingsystem.customer where accountnumber =?1", nativeQuery=true)
    public List<Payee> findByAccountTo(String accountnumber);
	
	
}
