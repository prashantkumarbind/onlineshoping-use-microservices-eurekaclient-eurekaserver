package com.pksoftware.entity;



public class PaymentDetails {

		String paymentMethod="googlePay";
		String paymentAmount="200";
		String payemntDate="02/10/2023";
		String accountNo="12778100035310";
		String bankName="Bank Of Broda";
		
		
		public String getPaymentMethod() {
			return paymentMethod;
		}
		public void setPaymentMethod(String paymentMethod) {
			this.paymentMethod = paymentMethod;
		}
		public String getPaymentAmount() {
			return paymentAmount;
		}
		public void setPaymentAmount(String paymentAmount) {
			this.paymentAmount = paymentAmount;
		}
		public String getPayemntDate() {
			return payemntDate;
		}
		public void setPayemntDate(String payemntDate) {
			this.payemntDate = payemntDate;
		}
		public String getAccountNo() {
			return accountNo;
		}
		public void setAccountNo(String accountNo) {
			this.accountNo = accountNo;
		}
		public String getBankName() {
			return bankName;
		}
		public void setBankName(String bankName) {
			this.bankName = bankName;
		}		
}
