package com.jsp.Account.Controller;

import com.jsp.dto.Account;
import com.jsp.service.AccountService;

public class Update_Account {
public static void main(String[] args) {
	Account account = new Account();
	account.setAccount_no("qd34rfe");
	account.setBalance(133);
	account.setIfsc_code("tj6et");
	account.setName("efbwjfwef");

	AccountService accountService = new AccountService();
	Account account2 = accountService.updateAccount(account, 3);

	if (account2 != null)
		System.out.println("Account has been updated");
}
}
