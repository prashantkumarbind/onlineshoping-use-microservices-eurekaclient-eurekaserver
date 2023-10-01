package com.pksoftware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pksoftware.entity.UserDetails;
import com.pksoftware.serviceimpl.UserDetailsServiceImpl;

@Controller
public class UserDetailsController {

		@Autowired
		UserDetailsServiceImpl impl;
		
		@ResponseBody
		@GetMapping("/userdetails/{id}")
		public UserDetails getObject(@PathVariable int id) {
			
				UserDetails details;
				details = impl.getObject();
				return details;
		}
}
