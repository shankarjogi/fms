package com.shankar.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flights {

	@Id
	private String source;
	private String destination;
	private String flightname;
	private String date;
	private String travel_fare;

	public String getTravel_fare() {
		return travel_fare;
	}

	public void setTravel_fare(String travel_fare) {
		this.travel_fare = travel_fare;
	}

	

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getflightname() {
		return flightname;
	}

	public void setflightname(String flightname) {
		this.flightname = flightname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Flights [source=" + source + ", destination=" + destination + ", flightname=" + flightname + ", date="
				+ date + ", travel_fare=" + travel_fare + "]";
	}
	

}
