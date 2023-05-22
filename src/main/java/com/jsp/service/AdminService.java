package com.jsp.service;

import java.util.ArrayList;
import java.util.List;

import com.jsp.dao.AdminDao;
import com.jsp.dao.BankManagerDao;
import com.jsp.dto.Admin;
import com.jsp.dto.BankManager;
import com.jsp.dto.Customer;

public class AdminService {
	
	AdminDao adminDao=new AdminDao();
	BankManagerDao bankManagerDao=new BankManagerDao();
	BankManagerService bankManagerService= new BankManagerService();
//	save Admin
	public Admin Insert(Admin admin) {
	return	adminDao.Insert(admin);
	}
//	Admin getbyId
	public Admin getAdminById(int id) {
		return adminDao.getAdminById(id);
	}
	
//	update Admin
	public Admin updateAdmin(Admin admin, int id) {
		Admin admin2 = adminDao.getAdminById(id);
		if(admin.getName()!=null)
			admin2.setName(admin.getName());
		if(admin.getEmail()!=null)
			admin2.setEmail(admin.getEmail());
		if(admin.getPassword()!=null)
			admin2.setPassword(admin.getPassword());
		if(admin2!=null) {
			return adminDao.updateAdmin(admin2);
}
		return null;
		
	}
	
//	delete Admin
	public Admin deleteAdmin(int id) {
		Admin admin = adminDao.getAdminById(id);
		if(admin!=null) {
			return adminDao.deleteAdmin(admin);
		}
		return null;
	}
	
//	getAllAdmin
	public List<Admin>getAllAdmin(){
		return adminDao.getAllAdmin();
		}
	
	
	
//	view all approved bank managers
	public List<BankManager> viewAllApprovedBankManagers() {

		BankManagerService bankManagerService = new BankManagerService();
		List<BankManager> bankManagers = bankManagerService.getAllBankManagers();
		List<BankManager> bankManagers2 = new ArrayList<BankManager>();

		for (BankManager bankManager : bankManagers) {
			if (bankManager.getStatus().equalsIgnoreCase("Approved"))
				bankManagers2.add(bankManager);
		}
		return bankManagers2;
	}
//view All Approved BankManagers
public List<BankManager> viewAllApprovedBankMangers() {
	List<BankManager> bankManagers=bankManagerService.getAllBankManagers();
	List<BankManager> bankManagers2=new ArrayList<BankManager>();
	
	for(BankManager bankManager: bankManagers) {
		if(bankManager.getStatus().equals("Approved"))
			bankManagers2.add(bankManager);

	}
	return bankManagers2;
}
	
	
	
//	Approved bankmanagerbyid
	public void approveBankManagerById(int admin_id, int bankmanager_id) {

		Admin admin = adminDao.getAdminById(admin_id);
		BankManager bankManager = bankManagerService.findbyId(bankmanager_id);

		if (admin.getId() == bankManager.getAdmin().getId()) {
			bankManager.setStatus("Approved");
			bankManagerDao.update(bankManager);
		} else
			System.out.println("Incorrect Details");

		
	}
	
		
		
	}
	
		
	
	

	
	





