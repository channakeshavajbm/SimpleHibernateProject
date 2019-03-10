package org.myworkz.login.tester;

import org.myworkz.login.dao.LogDAO;
import org.myworkz.login.dto.LogDTO;

public class LogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LogDTO logDTO = new LogDTO();
		logDTO.setFname("vishnu");
		logDTO.setLname("vardan");
		logDTO.setMobeliNo(8945615689l);
		logDTO.setEmail("sahasasimha@gmail.com");
		logDTO.setState("karnataka");
		logDTO.setNationality("indian");
		logDTO.setPincode(69);
		logDTO.setGender("male");

		LogDAO dao = new LogDAO();
		dao.save(logDTO);

	}

}
