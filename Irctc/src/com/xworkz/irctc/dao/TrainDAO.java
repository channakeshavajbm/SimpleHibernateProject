package com.xworkz.irctc.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



import com.xworkz.irctc.dto.TrainDTO;

public class TrainDAO {
	
	public TrainDAO() {
		// TODO Auto-generated constructor stub
		System.out.println("trainDAO has created..\t");
	}
	
	public void save(TrainDTO dto)
	{
		
		SessionFactory sessionFactory=null;
		Session session=null;
		
		try {
			
			Configuration configuration=new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(TrainDTO.class);
			
			sessionFactory=configuration.buildSessionFactory();
			session=sessionFactory.openSession();
			Transaction transaction=session.beginTransaction();
			
			session.save(dto);
			transaction.commit();
			System.out.println(dto);
			
			
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println("exception caused at saving dto" + e);
			e.printStackTrace();
		}
		
		finally {
			session.close();
			sessionFactory.close();
			
		}
		
	}

	
	
		public TrainDTO getById(int id) {
			System.out.println("invoked getById with arg: \t" + id);
			SessionFactory factory = null;
			Session session = null;
			Transaction transaction = null;
			try {
				Configuration configuration=new Configuration();
				configuration.configure();
				configuration.addAnnotatedClass(TrainDTO.class);
				
				factory=configuration.buildSessionFactory();
				System.out.println("factory is created .....................");
				session=factory.openSession();
				transaction=session.beginTransaction();
				
				TrainDTO dtoFromDb = session.get(TrainDTO.class, id);
				if(dtoFromDb != null) {
					System.out.println("data from db :\t" + dtoFromDb);
					transaction.commit();
					return dtoFromDb;
				}
				else {
					System.out.println("data not found for id \t" + id);
				}
				
			} 
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("exception data by id" + id);
			}
			finally {
				session.close();
				factory.close();
				System.out.println("closing resources...........");
			}
			
			return null;
		}
		
		
		public void updateNoOfCoachesById(int id, int newNoOfCoaches) {
			SessionFactory factory = null;
			Session session = null;
			Transaction transaction = null;
			System.out.println("invoked updateNoofCoachesById with args \t" + id + ":" + newNoOfCoaches);
			try {
				factory = new Configuration().configure().buildSessionFactory();
				session=factory.openSession();
				transaction = session.beginTransaction();
				
				TrainDTO dtoFromDb = session.get(TrainDTO.class, id);
				if(dtoFromDb != null) {
					System.out.println("dto is found for id \t" + id);
					dtoFromDb.setNoOfCoaches(newNoOfCoaches);
					session.update(dtoFromDb);
					transaction.commit();
					System.out.println("dto updated to db with id: \t" + id);
				}
				else {
					System.out.println("dto not found for id: \t" + id);
				}
				
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.err.println("Exception updating : \t" + e);
			}
			finally {
				session.close();
				factory.close();
				System.out.println("closing resources for updateNoOfCoaches ");
			}
		}
		
		public void deleteById(int id) {
			SessionFactory factory = null;
			Session session = null;
			Transaction transaction = null;
			System.out.println("invoked deleteById with args \t" + id);
			try {
				factory = new Configuration().configure().buildSessionFactory();
				session=factory.openSession();
				transaction = session.beginTransaction();
				
				TrainDTO dtoFromDb = session.get(TrainDTO.class, id);
				if(dtoFromDb != null) {
					System.out.println("dto is found for id \t" + id);
					session.delete(dtoFromDb);
					transaction.commit();
					System.out.println("dto delete from db with id: \t" + id);
				}
				else {
					System.out.println("dto not found for id: \t" + id);
				}
				
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.err.println("Exception deleting : \t" + e);
			}
			finally {
				session.close();
				factory.close();
				System.out.println("closing resources for deleting ");
			}
		}
		
		
	

}
