package com.jsp.Admin.controller;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

public class Delete_Admin_controller {
	public static void main(String[] args) {
	
//		cannot delete is is parent
		AdminService adminService = new AdminService();
		Admin admin= adminService.deleteAdmin(1);
		if(admin!=null) {
			System.out.println("recorded is deleted");
	}

}

}