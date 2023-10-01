package com.pksoftware.feignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pksoftware.entity.UserDetails;

@FeignClient(url="http://localhost:8381", value="userdetails")
public interface UserDetailsFeignClient {

	
		@GetMapping("/userdetails/{id}")
		public UserDetails getUserDetailsObject(@PathVariable int id);
}