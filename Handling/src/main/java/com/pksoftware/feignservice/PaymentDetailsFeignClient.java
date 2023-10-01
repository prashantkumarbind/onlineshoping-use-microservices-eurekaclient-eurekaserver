package com.pksoftware.feignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pksoftware.entity.PaymentDetails;

@FeignClient(url="http://localhost:8383", value="paymentdetails")
public interface PaymentDetailsFeignClient {

	
		@GetMapping("/paymentdetails/{id}")
		public PaymentDetails getPaymentObject(@PathVariable int id);
}
