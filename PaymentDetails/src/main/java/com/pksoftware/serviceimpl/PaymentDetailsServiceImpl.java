package com.pksoftware.serviceimpl;


import org.springframework.stereotype.Component;

import com.pksoftware.entity.PaymentDetails;
import com.pksoftware.service.PaymentDetailsService;

@Component
public class PaymentDetailsServiceImpl implements PaymentDetailsService{

	
	
	@Override
	public PaymentDetails getObjectPaymentdetails() {
		PaymentDetails details= new PaymentDetails();
		return details;
	}

}
