package com.icinbank.service;

import java.security.Principal;

import com.icinbank.model.PrimaryAccount;
import com.icinbank.model.SavingsAccount;

public interface AccountService {
	
	PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);

}
