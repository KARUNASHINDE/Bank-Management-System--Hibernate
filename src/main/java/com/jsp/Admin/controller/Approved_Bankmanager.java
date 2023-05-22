package com.jsp.Admin.controller;

import com.jsp.service.AdminService;

public class Approved_Bankmanager {
public static void main(String[] args) {
	AdminService adminService= new AdminService();
	adminService.approveBankManagerById(5 ,7);
}
}
