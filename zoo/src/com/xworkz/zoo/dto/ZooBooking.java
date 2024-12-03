package com.xworkz.zoo.dto;

public class ZooBooking {

	public void buyTicket(ZooBookingDTO zooBookingDTO) throws TicketBookingException {
		String name = zooBookingDTO.getCoustomerName();
		int ticket = zooBookingDTO.getNoofTicket();
		long no = zooBookingDTO.getMobile();
		String email = zooBookingDTO.getEmail();

		if (name.length() < 4) {
			System.out.println("im if condi");
			throw new TicketBookingException();
		} else {
			System.out.println("Booking Successfully");
		}
		
		
	}

}
