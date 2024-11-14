package com.xworkz.ticket.repo;

import com.xworkz.ticket.dto.TicketDTO;

public interface TickectRepo {
	
	int save(TicketDTO ticketDTO);
}