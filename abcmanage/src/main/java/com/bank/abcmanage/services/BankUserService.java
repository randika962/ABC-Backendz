package com.bank.abcmanage.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import com.bank.abcmanage.model.BankUser;
import com.bank.abcmanage.repositories.BankUserRepository;
import com.bank.abcmanage.repositories.BankUserRepository2;


@Service
public class BankUserService {
       
	@Autowired
	private BankUserRepository userrepo;
	
	@Autowired
	private BankUserRepository2 userrepo2;
	
	public void createBankUser(BankUser user)
	{
		userrepo.save(user);
	}
	
	public void updateBankUser(BankUser user) {
		
		System.out.println("Service Method Called");
		
		
		
		int update_u_id = user.getuId();
		
		System.out.println(update_u_id);
		
		BankUser updateUser = userrepo.findById(update_u_id).get();
		
		
		updateUser.setfName(user.getfName());
		updateUser.setlName(user.getlName());
		updateUser.setAddres(user.getAddres());
		
		userrepo.save(updateUser);
			
	}
	
	public List<BankUser> getAllBankUser()
	{
		return userrepo.findAll();
	}
	
	public BankUser getBankUserById(int uid)
	{
		return userrepo.findById(uid).get();
	}
	
	public void deleteBankUserById(int uid)
	{
		userrepo.deleteById(uid);
	}
	
	public Optional<BankUser> findUserByEmail(String username) {
		return userrepo2.findByUserEmail(username);
	}

}
