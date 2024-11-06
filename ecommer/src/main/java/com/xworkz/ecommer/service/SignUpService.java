package com.xworkz.ecommer.service;

import com.xworkz.ecommer.DTO.SignUpDTO;

public interface SignUpService {
	public  boolean validateAndSave(SignUpDTO dto);
		
}