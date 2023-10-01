package com.pksoftware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pksoftware.entity.ItemDetails;
import com.pksoftware.service.ItemDetailsService;

@Controller
public class ItemDetailsController {

		@Autowired
		ItemDetailsService detailsService;
	
		@ResponseBody
		@GetMapping("/itemdetails/{id}")
		public ItemDetails getObjectForReturn(@PathVariable int id) {
			ItemDetails details=null;
			details = detailsService.getObjectItemDetails();
			return details;
		}
}
