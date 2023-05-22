package com.jsp.BankManger.controller;

import com.jsp.dto.Admin;
import com.jsp.dto.BankManager;
import com.jsp.service.AdminService;
import com.jsp.service.BankManagerService;

public class save_bankmanager_controller {
	public static void main(String[] args) {
		BankManager bankManager = new BankManager();
		AdminService adminService = new AdminService();
		Admin admin = adminService.getAdminById(3);

		bankManager.setName("mohamadda");
		bankManager.setEmail("mogajl@gmail.com");
		bankManager.setStatus("approved");
		bankManager.setAdmin(admin);
		BankManagerService bankManagerService = new BankManagerService();
		bankManagerService.saveBankManager(bankManager);

	}
}
