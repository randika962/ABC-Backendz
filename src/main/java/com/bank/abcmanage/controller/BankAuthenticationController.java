package com.bank.abcmanage.controller;

import java.util.Optional;

/*
 * A controller class that creates a rest controller to handle all authentication related requests
 * 
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.abcmanage.model.AuthenticationRequest;
import com.bank.abcmanage.model.AuthenticationResponse;
import com.bank.abcmanage.model.BankResponse;
import com.bank.abcmanage.model.BankUser;
import com.bank.abcmanage.services.AuthUserDetailsService;
import com.bank.abcmanage.services.BankUserService;
import com.bank.abcmanage.utils.JwtUtil;

@RestController
@CrossOrigin(origins = "*")
public class BankAuthenticationController {
	
	//instantiate authenticationManager instance from spring security 
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtUtil jwtTokenUtil;

	//instantiate AuthUserDetails service 
	@Autowired
	private AuthUserDetailsService userDetailsService;
	
	//instantiate User service 

	@Autowired
	private BankUserService userService;

	//single endpoint for authentication
	@CrossOrigin
	@PostMapping("/authenticate")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest)
			throws Exception {

		try {
			//System.out.println("called");
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
					authenticationRequest.getUserEmail(), authenticationRequest.getPassword()));
		} catch (BadCredentialsException e) {
			throw new Exception("Incorrect username or password", e);
		}
        //System.out.println("Called2");
		final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUserEmail());

		final String jwt = jwtTokenUtil.generateToken(userDetails);
		System.out.println(userDetails.getUsername());
		System.out.println(jwt);
		Optional<BankUser> correspondingUser = userService.findUserByEmail(userDetails.getUsername());



		BankResponse body = new BankResponse(new AuthenticationResponse(jwt,correspondingUser), "success", "fetched");
		
		return ResponseEntity.status(HttpStatus.OK)
				.body(body);
			
	}

}


