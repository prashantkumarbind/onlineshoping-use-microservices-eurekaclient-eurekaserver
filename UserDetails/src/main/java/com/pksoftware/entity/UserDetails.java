package com.pksoftware.entity;

import org.springframework.beans.factory.annotation.Value;

public class UserDetails {
		
		
		String username="PRASHANT KUMAR";
		String address="CHAKIYA GIRDKOT HANDIA";
		String email="kumarbind463060@gmal.com";
		String mobile="8853292074";
		String city="PRAYAGRAJ";
		String zip="221502";
		String shopingdate="01/10/2023";
		
		
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getZip() {
			return zip;
		}
		public void setZip(String zip) {
			this.zip = zip;
		}
		public String getShopingdate() {
			return shopingdate;
		}
		public void setShopingdate(String shopingdate) {
			this.shopingdate = shopingdate;
		}
		
		
}
