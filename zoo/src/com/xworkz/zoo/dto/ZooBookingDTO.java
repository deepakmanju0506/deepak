package com.xworkz.zoo.dto;

import java.io.Serializable;

public class ZooBookingDTO implements Serializable {

	private String coustomerName;
	private int noofTicket;
	private long mobile;
	private String email;


		public ZooBookingDTO() {
			System.out.println("no-args constructer");
		}
		


		public ZooBookingDTO(String coustomerName, int noofTicket, long mobile, String email) {
			super();
			this.coustomerName = coustomerName;
			this.noofTicket = noofTicket;
			this.mobile = mobile;
			this.email = email;
		}



		public String getCoustomerName() {
			return coustomerName;
		}



		public void setCoustomerName(String coustomerName) {
			this.coustomerName = coustomerName;
		}



		public int getNoofTicket() {
			return noofTicket;
		}



		public void setNoofTicket(int noofTicket) {
			this.noofTicket = noofTicket;
		}



		public long getMobile() {
			return mobile;
		}



		public void setMobile(long mobile) {
			this.mobile = mobile;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
		}


		
}