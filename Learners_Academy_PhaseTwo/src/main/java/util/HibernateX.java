package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateX {
	
	static Session session;
	static Configuration cfg= new Configuration().configure("hibernate.cfg.xml");
	static SessionFactory sf= cfg.buildSessionFactory();
	
	public static Session getsession()
	{
		
		//cfg.configure("hibernate.cfg.xml");
		
		//SessionFactory sf=cfg.buildSessionFactory();
		
		if(session==null||session.isOpen()==false)
		{
		sf= cfg.buildSessionFactory();
		session=sf.openSession();
		return(session);
		}
		else {
			System.out.println("CHECK POINT");
			return session;
		}
	}

}

