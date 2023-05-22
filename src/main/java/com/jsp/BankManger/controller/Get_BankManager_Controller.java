package com.jsp.BankManger.controller;

import com.jsp.dto.BankManager;
import com.jsp.service.BankManagerService;

public class Get_BankManager_Controller {
	public static void main(String[] args) {
		BankManagerService bankManagerService = new BankManagerService();
		BankManager bankManager= bankManagerService.findbyId(3);
	
		if(bankManager!=null) {
			System.out.println(bankManager.getName());
			System.out.println(bankManager.getEmail());
	}

}
}
	
