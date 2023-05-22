package com.jsp.BankManger.controller;

import com.jsp.dto.Admin;
import com.jsp.dto.BankManager;
import com.jsp.service.AdminService;
import com.jsp.service.BankManagerService;

public class Delete_Bankmanager_Controller {
	public static void main(String[] args) {
		
	BankManagerService bankManagerService = new BankManagerService();
	BankManager bankManager= bankManagerService.deleteBankManager(2);
		if(bankManager!=null) {
			System.out.println("recorded is deleteed");
	}

	}
	
}
	


