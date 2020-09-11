package com.naga.shares.profile;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SharesCollection")
public class RegisterPOJO {
	
	 private String uname;
	 private String psw;
	 private String email;
	 private String fname;
	 private String lname;
	 private double mobile;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public double getMobile() {
		return mobile;
	}
	public void setMobile(double mobile) {
		this.mobile = mobile;
	}
	
	 
	 

}
