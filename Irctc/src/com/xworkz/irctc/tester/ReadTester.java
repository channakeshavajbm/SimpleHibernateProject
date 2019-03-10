package com.xworkz.irctc.tester;

import com.xworkz.irctc.dao.TrainDAO;
import com.xworkz.irctc.dto.TrainDTO;

public class ReadTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TrainDAO dao = new TrainDAO();
TrainDTO dto =dao.getById(7);
System.out.println("dto found from dao\t" + dto);
		
	}

}
