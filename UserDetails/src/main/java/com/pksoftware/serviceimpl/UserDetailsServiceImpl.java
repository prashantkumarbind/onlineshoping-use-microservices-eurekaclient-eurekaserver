package com.pksoftware.serviceimpl;

import org.springframework.stereotype.Component;

import com.pksoftware.entity.UserDetails;
import com.pksoftware.service.UserDetailsService;


@Component
public class UserDetailsServiceImpl implements UserDetailsService{

	UserDetails details;
	
	@Override
	public UserDetails getObject() {
		   details = new UserDetails();
		   return details;
	}

}
