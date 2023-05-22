package com.jsp.Admin.controller;

import com.jsp.dto.Admin;
import com.jsp.dto.Customer;
import com.jsp.service.AdminService;


public class GetAdmin_ById_Controller {
	public static void main(String[] args) {
AdminService adminService = new AdminService();
Admin admin = adminService.getAdminById(1);

		if (admin != null) {
			System.out.println(admin.getEmail());
			System.out.println(admin.getId());
			System.out.println(admin.getName());
		}
	}
	

}
