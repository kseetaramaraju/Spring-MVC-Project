package com.main.Repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.main.Entiry.User;

@Repository
public class SignUpRepository {

	Configuration cfg=new Configuration().configure().addAnnotatedClass(User.class);
	SessionFactory sf = cfg.buildSessionFactory();

	//FOR INSERTING
	public void userDetails(User user) {
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();

		session.save(user);

		trans.commit();
		session.close();

	}
	
   //FOR UPDATING
	public void userUpdate(String id,String name) {
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();

		User user2 = session.get(User.class,id);
		user2.setuName(name);
		
		session.update(user2);

		trans.commit();
		session.close();

	}
	
   //FOR DELETING
	public void userDelete(String id) {
		
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();

		User user2 = session.get(User.class,id);
		
		session.delete(user2);

		trans.commit();
		session.close();

	}

	public List userGetAllData() {
		
		Session session =sf.openSession();
		Transaction trans = session.beginTransaction();

	  Query createQuery = session.createQuery("from User");
	  List<User> list = createQuery.list();

	 
	  
		trans.commit();
		session.close();
		
		return list;
	}

	
}
