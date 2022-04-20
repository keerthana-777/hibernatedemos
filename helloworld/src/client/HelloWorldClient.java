package client;



import org.hibernate.Session;

import domain.Message;
import util.HIbernateUtil;

public class HelloWorldClient {

	public static void main(String[] args) {
		
		Session session = HIbernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Message message = new Message("hello world from client");
		
		session.save(message);
		
		session.getTransaction().commit();
		session.close();
	}
}
