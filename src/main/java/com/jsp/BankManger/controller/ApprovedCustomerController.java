package com.jsp.BankManger.controller;

import com.jsp.service.BankManagerService;

public class ApprovedCustomerController {
	public static void main(String[] args) {
		BankManagerService bankManagerService = new BankManagerService();
		bankManagerService.approveCustomerById(3, 4);
	}

}
