package com.icinbank.dao;

import org.springframework.data.repository.CrudRepository;

import com.icinbank.model.PrimaryAccount;

public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long>{
 PrimaryAccount findByAccountNumber(int accountNumber);
}
