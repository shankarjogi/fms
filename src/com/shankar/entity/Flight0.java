package com.shankar.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "FlightSequenceGenerator", initialValue = 20190401, allocationSize = 1)
public class Flight0 {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FlightSequenceGenerator")
	private int ticket_no;
	private String first_name;
	private String last_name;
	private String d_o_b;
	private String nationality;
	private String gender;
	private String flightname;

	public String getFlightName() {
		return flightname;
	}

	public void setFlightName(String flightName) {
		this.flightname = flightName;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getD_o_b() {
		return d_o_b;
	}

	public void setD_o_b(String d_o_b) {
		this.d_o_b = d_o_b;
	}

	public String getFlightname() {
		return flightname;
	}

	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}

	public int getTicket_no() {
		return ticket_no;
	}

	public void setTicket_no(int ticket_no) {
		this.ticket_no = ticket_no;
	}

}
