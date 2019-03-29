package com.shankar;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.shankar.entity.Flight0;
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
		if (a.size() == 0) {
			return "InvalidUsername";
		}
		session.close();
		return a.get(0);

	}

	public static void registerUser(Login userdata) {
		Session session = factory.openSession();

		session.beginTransaction();
		session.save(userdata);

		session.getTransaction().commit();
		session.close();

	}

	public static List<Flights> getFlights(String source, String destination, String date) {

		Session session = factory.openSession();

		session.beginTransaction();
		// Create Native Query implies that we are using NATIVE SQL Statement for our
		// query. Note that: We are not using HQL
		Query query = session.createQuery(
				"select flightname, travel_fare, source, destination from Flights where source=:source and destination=:destination and date=:date");
		query.setParameter("source", source);
		query.setParameter("destination", destination);
		query.setParameter("date", date);
		List<Object[]> list = query.list();
		List<Flights> flightList = new ArrayList<Flights>();
		session.getTransaction().commit();
		session.close();
		System.out.println(list.size());
		
		//for
		for (Object[] obj : list) {
			
			Flights flights = new Flights();
			flights.setflightname((String)obj[0]);
			flights.setTravel_fare((String)obj[1]);
			flights.setSource((String)obj[2]);
			flights.setDestination((String)obj[3]);
	
			flightList.add(flights);
			
		}
		return flightList;

	}

	public static BigInteger getSeats(String totalpassenger) {
		Session session = factory.openSession();
		session.beginTransaction();
		// Query query=session.createQuery("SELECT totalpassenger from Flight0 where
		// totalpassenger=:totalpassenger");
		NativeQuery query = session.createSQLQuery("SELECT COUNT(*) FROM Flight0");
//		query.setParameter("totalpassenger", totalpassenger);
//		long totalpassengers = (long)query.uniqueResult();
		BigInteger users=(BigInteger)query.uniqueResult();
		session.getTransaction().commit();
		session.close();
		System.out.println(users);
		return users;
	

	}

	public static int getbookings(String first_name, String last_name, String d_o_b, String nationality,
			String gender, String flightname ) {
		Session session = factory.openSession();
		session.beginTransaction();
		
		Flight0 a= new Flight0();
		a.setFirst_name(first_name);
		a.setLast_name(last_name);
		a.setD_o_b(d_o_b);
		a.setNationality(nationality);
		a.setGender(gender);
		a.setFlightName(flightname);
	
		session.save(a);
		
		session.getTransaction().commit();
		session.close();
		
	return a.getTicket_no();
	
	}
}
