package com.pksoftware.serviceimpl;

import org.springframework.stereotype.Component;

import com.pksoftware.entity.ItemDetails;
import com.pksoftware.service.ItemDetailsService;

@Component
public class ItemDetailsServiceImpl implements ItemDetailsService{

	ItemDetails details;
	
	@Override
	public ItemDetails getObjectItemDetails() {
		details = new ItemDetails();
		return details;
	}
}
