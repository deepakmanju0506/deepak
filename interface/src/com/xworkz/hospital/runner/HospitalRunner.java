package com.xworkz.hospital.runner;

import com.xworkz.hospital.internal.*;

public class HospitalRunner  {
	public static void main(String[] args) {

		Hospital hospitalRule = new Hospital();
		hospitalRule.mask();
		hospitalRule.noSmoking();
		hospitalRule.silence();
		}

}
