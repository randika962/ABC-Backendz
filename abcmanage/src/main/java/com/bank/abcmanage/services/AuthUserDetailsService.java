package com.bank.abcmanage.services;

/*
 * A service to manage user authentication
 */

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bank.abcmanage.model.AuthUserDetails;
import com.bank.abcmanage.model.BankUser;
import com.bank.abcmanage.repositories.BankUserRepository;
import com.bank.abcmanage.repositories.BankUserRepository2;

	//annotate to specify this class is to be used as a service
	@Service
	public class AuthUserDetailsService implements UserDetailsService {

		//instantiation of the userRepo object in order to verify user details
	    @Autowired
	    BankUserRepository2 userRepository;

		//functional method that are used by the controller
	    @Override
	    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
	        Optional<BankUser> user = userRepository.findByUserEmail(userName);

	        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));

	        return user.map(AuthUserDetails::new).get();
	    }
	}



