package com.icinbank.dao;

import org.springframework.data.repository.CrudRepository;

import com.icinbank.model.SavingsAccount;

public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber (int accountNumber);
}