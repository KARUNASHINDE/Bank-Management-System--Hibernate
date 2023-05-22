package com.jsp.Admin.controller;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;


public class update_admin_controller {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setName("sdfiraj");
		admin.setEmail("sai@34gmial.com");
		admin.setPassword("ghmf5gh");
		
		
		AdminService adminService = new AdminService();
		Admin admin2 = adminService.updateAdmin(admin, 1);
		if(admin2!=null) {
			System.out.println("record updated");
		}
	}

}


		
		
		
		