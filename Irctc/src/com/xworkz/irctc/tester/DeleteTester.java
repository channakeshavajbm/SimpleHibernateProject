package com.xworkz.irctc.tester;

import com.xworkz.irctc.dao.TrainDAO;

public class DeleteTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TrainDAO dao = new TrainDAO();
		dao.deleteById(6);
	}

}
