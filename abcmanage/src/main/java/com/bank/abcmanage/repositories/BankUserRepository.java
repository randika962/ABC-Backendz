package com.bank.abcmanage.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.abcmanage.model.BankUser;

public interface BankUserRepository extends JpaRepository<BankUser, Integer> {
//	Optional<BankUser> findByBankUserId(int uId);
//	
//	Optional<BankUser> deleteByBankUserId(int uId);
	
//	Optional<BankUser> findByUserEmail(String userName);

}
