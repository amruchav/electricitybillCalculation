package com.cg.bean;

public class CustomerBean {
 private int consumerNo;
 private String customerName;
 private String emailId;
 private String phoneNo;
 private int payAmount;
 
 
public int getConsumerNo() {
	return consumerNo;
}
public void setConsumerNo(int consumerNo) {
	this.consumerNo = consumerNo;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}
public int getPayAmount() {
	return payAmount;
}
public void setPayAmount(int payAmount) {
	this.payAmount = payAmount;
}



public CustomerBean(int consumerNo, String customerName, String emailId,
		String phoneNo) {
	super();
	this.consumerNo = consumerNo;
	this.customerName = customerName;
	this.emailId = emailId;
	this.phoneNo = phoneNo;
}

public CustomerBean() {
	
}
}


