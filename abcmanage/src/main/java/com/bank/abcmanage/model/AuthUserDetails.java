package com.bank.abcmanage.model;

/*
 * An model for the userDetails object required by Spring Security for token validation
 */

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.bank.abcmanage.model.BankUser;
import com.bank.abcmanage.model.AuthenticationRequest;

	public class AuthUserDetails implements UserDetails {

	    private String userName;
	    private String password;
	    private boolean active;
	    private List<GrantedAuthority> authorities;

	    public AuthUserDetails(BankUser user) {
	        this.userName = user.getUserEmail();
	        this.password = user.getPassword();
	        this.active = true;
	        
	        this.authorities = Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
	    }

	    @Override
	    public Collection<? extends GrantedAuthority> getAuthorities() {
	        return authorities;
	    }

	    @Override
	    public String getPassword() {
	        return password;
	    }

	    @Override
	    public String getUsername() {
	        return userName;
	    }

	    @Override
	    public boolean isAccountNonExpired() {
	        return true;
	    }

	    @Override
	    public boolean isAccountNonLocked() {
	        return true;
	    }

	    @Override
	    public boolean isCredentialsNonExpired() {
	        return true;
	    }

	    @Override
	    public boolean isEnabled() {
	        return active;
	    }
	}



