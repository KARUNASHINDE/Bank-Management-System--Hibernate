package com.jsp.Account.Controller;

import java.util.List;

import com.jsp.dto.Account;
import com.jsp.service.AccountService;

public class GetAll_Account {

	public static void main(String[] args) {
AccountService accountService = new AccountService();
List<Account> accounts = accountService.getallAccounts();
for(Account account :accounts) {
	System.out.println("===============================================");
	System.out.println("Account Id        : " + account.getId());
	System.out.println("Account Name      : " + account.getName());
	System.out.println("Account IFSC_code : " + account.getIfsc_code());
	System.out.println("Account Acc_no    : " + account.getAccount_no());
	System.out.println("Account Balance   : " + account.getBalance());
}
}



}
