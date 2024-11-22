package com.xworkz.zoo.runner;

import com.xworkz.zoo.dto.TicketBookingException;
import com.xworkz.zoo.dto.ZooBooking;
import com.xworkz.zoo.dto.ZooBookingDTO;

public class ZooBookingRunner {

	public static void main(String[] args) {
		
		ZooBookingDTO zooBookingDTO = new ZooBookingDTO("deepak", 4, 6363827481l, "deepakmanju2002@gmail.com");
		ZooBooking zooBooking = new ZooBooking();
		try {
			zooBooking.buyTicket(zooBookingDTO);
		} catch (TicketBookingException e) {
			
			e.getMessage();
		}
		
            
	}

}
