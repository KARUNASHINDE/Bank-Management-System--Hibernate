package com.jsp.Account.Controller;

import com.jsp.service.AccountService;

public class TransferMOney_Account {

	public static void main(String[] args) {
AccountService accountService = new AccountService();
accountService.transferMoney(5, 6, 5, 10000);

	}

}
