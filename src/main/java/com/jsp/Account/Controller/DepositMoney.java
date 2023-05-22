package com.jsp.Account.Controller;

import com.jsp.service.AccountService;

public class DepositMoney {
	public static void main(String[] args) {
		AccountService accountService = new AccountService();
		accountService.depositMoney(4, 4, 56785);
	}

}
