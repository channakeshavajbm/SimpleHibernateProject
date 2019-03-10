package org.myworkz.login.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.myworkz.login.dto.LogDTO;

public class LogDAO {

	public LogDAO() {
		// TODO Auto-generated constructor stub
		System.out.println("LogDAO has created......\t");
	}

	public void save(LogDTO dto) {
		System.out.println("invoked save ..............");
		SessionFactory sf = null;
		Session s = null;
		Transaction tx = null;
		try {
			sf = new Configuration().configure().buildSessionFactory();
			s = sf.openSession();
			tx = s.beginTransaction();
			System.out.println("factory created................");

			s.save(dto);
			tx.commit();
			System.out.println(dto);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.err.println("exception caused at data saving .......dto\t" + e);
		}

		finally {
			s.close();
			sf.close();
		}
	}

}
