package com.jsp.customer.controller;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

public class Save_Customer_Controller {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setName("karuna");
		customer.setStatus("approved");
		
		
		CustomerService customerService =new CustomerService();
		customerService.SaveCustomer(customer);
	}




}