package com.bank.abcmanage.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.abcmanage.model.BankUser;

public interface BankUserRepository2 extends JpaRepository<BankUser, String> {

	Optional<BankUser> findByUserEmail(String userName);
}
