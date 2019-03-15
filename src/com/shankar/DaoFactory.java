package com.shankar;

import java.util.List;

import javax.persistence.NamedNativeQuery;

import org.h2.engine.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

import com.shankar.entity.Flights;
import com.shankar.entity.Login;

@org.springframework.stereotype.Service

public class DaoFactory {
	static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	public static String getPassword(String username) {
		
		Session session = factory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("select password from Login where username=:a");
		query.setParameter("a", username);
		List<String> a = query.list();
		if(a.size()==0) {
			return "InvalidUsername";
		}
		session.close();
		return a.get(0);
	
	}

	public static void registerUser(Login userdata) {
		Session session=factory.openSession();
		
		session.beginTransaction();
		session.save(userdata);
	
		session.getTransaction().commit();
		session.close();
		

	}
public static List<String> getFlights(String source, String destination){
	
	Session session=factory.openSession();

	session.beginTransaction();
	//Create Native Query implies that we are using NATIVE SQL Statement for our query. Note that: We are not using HQL
	Query query=session.createQuery("select flightname from Flights where source=:source and destination=:destination");
	query.setParameter("source", source);	
	query.setParameter("destination", destination);
	List<String> flights=query.list();
	session.getTransaction().commit();
	session.close();
	System.out.println(flights.size());
	System.out.println(flights.toString());
	return flights;
	
	
}
}