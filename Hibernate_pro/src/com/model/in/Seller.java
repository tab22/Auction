package com.model.in;

public class Seller {
	 private int id;
		private String name;
		private String email;
		private String dob;
		private String gender;
		private String address;
		private int mobile;
		private String password;

		public Seller() {
			super();
			// TODO Auto-generated constructor stub
		}
	
	
		public Seller(int id, String name, String email, String dob, String gender, String address, int mobile,
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
		public int getMobile() {
			return mobile;
		}
		public void setMobile(int mobile) {
			this.mobile = mobile;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		

	
}
