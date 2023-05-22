package com.jsp.service;

import java.util.List;

import com.jsp.dao.AccountDao;
import com.jsp.dto.Account;

public class AccountService {
	AccountDao accountDao=new AccountDao();
//	saveAccount
	public Account saveAccount(Account account) {
		if(account!=null) {
			account.setBalance(0);
		}
		return accountDao.saveAccount(account);
	}
	
//	getbyidAccount
	public Account getById_Account(int id) {
		return accountDao.getById_Account(id);
	}
	
//	delete account
	public Account deleteAccount(int id) {
		Account account = accountDao.getById_Account(id);
		if(account !=null)
	return accountDao.deleteAccount(account);
	return null;
	}
//	update Account
	public Account updateAccount(Account account, int id) {
  Account account2=   accountDao.getById_Account(id);
  
  accountDao.getById_Account(id);
	if (account.getName() != null) {
		account2.setName(account.getName());
	}
	if (account.getAccount_no()!= null) {
		account2.setAccount_no(account.getAccount_no());
	}
	if (account.getBalance() !=0) {
		account2.setBalance(account.getBalance());
	}
	if (account.getIfsc_code() != null) {
		account2.setIfsc_code(account.getIfsc_code());
	}
	if (account2 != null) {
		account2.setBalance(0);
		return accountDao.updateAccount(account2);
	}
	return null;
	
}
//	GetAllAccounts
	public List<Account>getallAccounts(){
		return accountDao.getAllAccounts();
		}
	
//	deposit money
	public Account depositMoney(int customer_id, int account_no, double amount) {
	return accountDao.depositMoney(customer_id, account_no, amount);
	
}
//	TransferMoney
	public Account transferMoney(int customer_id, int sender, int reciever, double amount) {
return accountDao.transferMoney(customer_id, sender, reciever, amount);
	}
	
}