package com.pksoftware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pksoftware.entity.PaymentDetails;
import com.pksoftware.service.PaymentDetailsService;

@Controller
public class PaymentDetailsController {

		@Autowired
		PaymentDetailsService detailsService;
		
		
		@ResponseBody
		@GetMapping("/paymentdetails/{id}")
		public PaymentDetails getObject(@PathVariable int id) {
			PaymentDetails details = new PaymentDetails();
			details = detailsService.getObjectPaymentdetails();
			return details;
		}
}
