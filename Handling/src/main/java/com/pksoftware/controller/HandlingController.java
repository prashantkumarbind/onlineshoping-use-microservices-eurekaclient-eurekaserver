package com.pksoftware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.pksoftware.entity.Handling;
import com.pksoftware.entity.ItemDetails;
import com.pksoftware.entity.PaymentDetails;
import com.pksoftware.entity.UserDetails;
import com.pksoftware.feignservice.ItemDetailsFeignClient;
import com.pksoftware.feignservice.PaymentDetailsFeignClient;
import com.pksoftware.feignservice.UserDetailsFeignClient;

@Controller
public class HandlingController {

		@Autowired
		RestTemplate restTemplate;
		
		@Autowired
		UserDetailsFeignClient userclient;
		@Autowired
		ItemDetailsFeignClient itemclient;
		@Autowired
		PaymentDetailsFeignClient paymentclient;
		
		
		Handling handling;
		
		@ResponseBody
		@GetMapping("testing/{name}")
		public String test(@PathVariable String name) {
			
			   return "Your Name is the::"+name;
		}
		//************************ FRIST USE OF THE RestTemplate class exchange method**************************
		@ResponseBody
		@GetMapping("/finalrecord/{id}")
		public Handling getTotalDetails(@PathVariable int id) {
			
			ResponseEntity<UserDetails> userDetails = restTemplate.exchange("http://localhost:8381/userdetails/"+id, HttpMethod.GET, null, UserDetails.class);
			ResponseEntity<ItemDetails> itemDetails = restTemplate.exchange("http://localhost:8382/itemdetails/"+id, HttpMethod.GET, null, ItemDetails.class);
			ResponseEntity<PaymentDetails> paymentDetails = restTemplate.exchange("http://localhost:8383/paymentdetails/"+id, HttpMethod.GET, null, PaymentDetails.class);
		
				
				handling = new Handling();
				handling.setUserDetails(userDetails.getBody());
				handling.setItemDetails(itemDetails.getBody());
				handling.setPaymentDetails(paymentDetails.getBody());
				return handling;
		
		}
		
		//***************************use of the getForOject method *************************
		
		@ResponseBody
		@GetMapping("/record/{id}")
		public Handling getTotalRecored(@PathVariable int id) {
			
			UserDetails userDetails1 = restTemplate.getForObject("http://localhost:8381/userdetails/"+id, UserDetails.class);
			ItemDetails itemdetails1 = restTemplate.getForObject("http://localhost:8382/itemdetails/"+id, ItemDetails.class);
			PaymentDetails paymentdetails =restTemplate.getForObject("http://localhost:8383/paymentdetails/"+id, PaymentDetails.class);
			handling = new Handling();
			handling.setUserDetails(userDetails1);
			handling.setItemDetails(itemdetails1);
			handling.setPaymentDetails(paymentdetails);
			return handling;
		}
		
		// use of the feign client
		
		@ResponseBody
		@GetMapping("/userfeign/{id}")
		public Handling useFeignClient(@PathVariable int id) {
			   handling = new Handling();
			   
			   UserDetails userDetails = userclient.getUserDetailsObject(id);
			   ItemDetails itemDetails = itemclient.getItemDetailsObject(id);
			   PaymentDetails  paymentDetails = paymentclient.getPaymentObject(id);
			   handling.setUserDetails(userDetails);
			   handling.setItemDetails(itemDetails);
			   handling.setPaymentDetails(paymentDetails);
				
			   return handling;
		}
}
