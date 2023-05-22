package com.jsp.Admin.controller;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

public class Save_Admin_Controller {
	public static void main(String[] args) {
		Admin admin=new Admin();
		admin.setName("punit");
		admin.setEmail("pun350@gmail.com");
		admin.setPassword("t67jghjn4");
		
		
		AdminService adminService=new AdminService();
		 adminService.Insert(admin);
		 if(admin!=null)
			 System.out.println("Admin"+admin.getName()+"added");
		 System.out.println("Admin"+admin.getEmail()+"added");
	
	}
	

}
