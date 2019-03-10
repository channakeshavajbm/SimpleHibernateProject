package com.xworkz.irctc.tester;

import com.xworkz.irctc.dao.TrainDAO;
import com.xworkz.irctc.dto.TrainDTO;

public class TrainTester {

	public static void main(String[] args) {

		TrainDTO dto = new TrainDTO();
		dto.setTid(1);
		dto.setTname("train18");
		dto.setTnumber(18128);
		dto.setType("super fast");
		dto.setNoOfCoaches(18);

		TrainDAO dao = new TrainDAO();
		dao.save(dto);

	}

}
