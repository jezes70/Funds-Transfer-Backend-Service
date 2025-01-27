package com.moneytransfer.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.moneytransfer.entity.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {

	List<Transaction> findAllByAccountIdAndTransactionDateBetween(Long accountId, Date fromDate, Date toDate);

}
