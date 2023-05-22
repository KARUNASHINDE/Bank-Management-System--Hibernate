package com.jsp.service;

import java.util.List;

import com.jsp.dao.BankManagerDao;
import com.jsp.dao.CustomerDao;
import com.jsp.dto.BankManager;
import com.jsp.dto.Customer;

public class BankManagerService {
	BankManagerDao bankManagerDao = new BankManagerDao();
	CustomerService customerService= new CustomerService();
	CustomerDao customerDao = new CustomerDao();
//	save manager
	public BankManager saveBankManager(BankManager bankManager) {
	if(bankManager!=null) {
		bankManager.setStatus("unapproved");
	}
		return	bankManagerDao.saveBankManager(bankManager);
		
	}
	
//	find manager by id
	public BankManager findbyId(int id) {
		return bankManagerDao.findbyId(id);
		
	}
//	delete manager
	
	public BankManager deleteBankManager(int id) {
	BankManager bankManager =	bankManagerDao.findbyId(id);
		if(bankManagerDao!=null) {
			return bankManagerDao.deleteBankManager(bankManager);
		}
		return null;
	
	
//update manager		
	
	}
	
	public BankManager updateBankManager(BankManager bankManager,int id) {
		BankManager bankManager2 = bankManagerDao.findbyId(id);
		if(bankManager.getName()!=null)
			bankManager2.setName(bankManager.getName());
		if(bankManager.getEmail()!=null) {
			bankManager2.setEmail(bankManager.getEmail());
	
		if(bankManager.getStatus() !=null) 
			bankManager2.setStatus(bankManager.getStatus());
	}
		
		if(bankManager2!=null) {
			bankManager2.setStatus("unapproved");
			return bankManagerDao.update(bankManager2);
		}
		return null;
	
	
	}
//	getAll BankMangers
	public List<BankManager>getAllBankManagers(){
		return bankManagerDao.getAllBankManagers();
	}

//	approved Customer by id
	public void approveCustomerById(int id, int customer_id) {
		BankManager bankManager = bankManagerDao.findbyId(id);
		Customer customer = customerService.getCustomerbyId(customer_id);

		if (bankManager.getStatus().equals("Approved")) {
			if (bankManager.getId() == customer.getBankManager().getId()) {
				customer.setStatus("Approved");
				customerDao.updateCustomer(customer);
			} else
				System.out.println("not matched id");
		} else
			System.out.println("Get Approved First");
	}

}

	
			

