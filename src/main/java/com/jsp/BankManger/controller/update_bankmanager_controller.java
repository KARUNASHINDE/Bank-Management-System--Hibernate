package com.jsp.BankManger.controller;

import com.jsp.dto.BankManager;
import com.jsp.service.BankManagerService;

public class update_bankmanager_controller {
	public static void main(String[] args) {
		
		BankManager bankManager = new BankManager();
		bankManager.setName("kajal");
		bankManager.setEmail("kajal@gmail.com");
	BankManagerService bankManagerService = new BankManagerService();
	BankManager bankManager2= bankManagerService.updateBankManager(bankManager, 1);
	if(bankManager2!=null) {
		System.out.println("recorded is updated");
	
     
     
}}
	
}



