package com.cts.app.AcService.entity;

public class Register {

private int customerId;
private String name;
private String email;
private String phone;
private String password;

public Register(int customerId, String name, String email,String phone, String password) {
	super();
	this.customerId = customerId;
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.password = password;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Register [customerId=" + customerId + ", name=" + name + ", email=" + email + ", phone=" + phone
			+ ", password=" + password + "]";
}
public Register() {
	super();
	// TODO Auto-generated constructor stub
}



}