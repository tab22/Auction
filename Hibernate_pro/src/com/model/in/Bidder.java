package com.model.in;

import java.sql.Date;

public class Bidder {
    private int id;
	private String name;
	private String email;
	private String dob;
	private String gender;
	private String address;
	private String mobile;
	private String password;

	public Bidder(int id, String name, String email, String dob, String gender, String address, String mobile,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.mobile = mobile;
		this.password = password;
	}
	/**
	 * 
	 */
	public Bidder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Bidder [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", gender=" + gender
				+ ", address=" + address + ", mobile=" + mobile + ", password=" + password + "]";
	}
	
	
	
	
	
	}

