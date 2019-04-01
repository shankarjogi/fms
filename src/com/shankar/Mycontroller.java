package com.shankar;

import java.io.IOException;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shankar.entity.Flights;
import com.shankar.entity.Login;

@Controller
public class Mycontroller {

	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("Hi");
		HttpSession session = request.getSession();
		session.setAttribute("sh", username);
		ModelAndView mv = new ModelAndView();

		if ((username.equals(username)) && (password.equals(DaoFactory.getPassword(username)))) {
			mv.addObject("sh", username);
			mv.setViewName("flight0.jsp");
			mv.addObject("s", password);
			Date dNow = new Date();
			SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
			mv.addObject("date", ft.format(dNow));
			mv.setViewName("welcome.jsp");
			return mv;
		}
		if (DaoFactory.getPassword(username).equals("InvalidUsername")) {
			System.out.println("Invalid Username");
			mv.setViewName("login.jsp");
			mv.addObject("errorMsg", "Invalid Credentials!!");
			return mv;
		}

		else {
			response.sendRedirect("login.jsp");

		}
		return null;

	}
	// CODE FOR NEW REGISTER

	@RequestMapping("/register")
	public ModelAndView SignUp(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String contact_info = request.getParameter("contact_info");
		String password = request.getParameter("password");
		String confirm_password = request.getParameter("confirm_password");
		Login userdata = new Login();
		userdata.setUsername(username);
		userdata.setPassword(password);
		userdata.setEmail(email);
		userdata.setConfirm_password(confirm_password);
		userdata.setContact_info(contact_info);
		DaoFactory.registerUser(userdata);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login.jsp");
		mv.addObject("Register", "Registration Successful");
		return mv;

	}

	// code for searching flight
	@RequestMapping("/SearchFlight")
	public ModelAndView Search(HttpServletRequest request, HttpServletResponse response) {
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String date = request.getParameter("date");
		String travel_fare=request.getParameter("travel_fare");
		String flightname=request.getParameter("flightname");
		HttpSession session = request.getSession();
/*		session.removeAttribute("flightname");*/
		session.setAttribute("source", source);
		session.setAttribute("destination", destination);
		session.setAttribute("flightname", flightname);
		session.setAttribute("date", date);
		session.setAttribute("travel", travel_fare);
		System.out.println(source + " " + destination + " " + date+" "+flightname);
		List<Flights> flights = DaoFactory.getFlights(source, destination, date);
		ModelAndView mv = new ModelAndView();
		/*mv.addObject("travel", flights);*/
	
		
		mv.setViewName("SearchFlights.jsp");
		mv.addObject("date", date);
		mv.setViewName("SearchFlights.jsp");
		mv.addObject("source", source);
		mv.setViewName("SearchFlights.jsp");
		mv.addObject("destination", destination);
		mv.setViewName("SearchFlights.jsp");

		mv.addObject("flight", flights);
		mv.setViewName("SearchFlights.jsp");
		return mv;

	}

	// code for flight0
	@RequestMapping("/flight0")
	public ModelAndView search(HttpServletRequest request, HttpServletResponse response) {
		String first_name = request.getParameter("first_name");
		BigInteger Users = DaoFactory.getSeats(first_name);

		ModelAndView mv = new ModelAndView();
		mv.addObject("users", Users);
		mv.setViewName("flight0_booking.jsp");

		return mv;

	}

	@RequestMapping("/Book")
	public ModelAndView Search1(HttpServletRequest request, HttpServletResponse response) {
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String d_0_b = request.getParameter("d_0_b");
		String nationality = request.getParameter("nationality");
		String gender = request.getParameter("gender");
		
		HttpSession session=request.getSession();
	    String flightname=(String) session.getAttribute("flightname");
		int ticket_no=DaoFactory.getbookings(first_name, last_name, d_0_b, nationality, gender, flightname);
		BigInteger Users = DaoFactory.getSeats(first_name);
		ModelAndView mv = new ModelAndView();

		
		session.setAttribute("name", first_name + " " +last_name);
		session.setAttribute("dob", d_0_b);
		session.setAttribute("nationality", nationality);
	    session.setAttribute("gender", gender);
	    session.setAttribute("flightname", flightname);
		
	    session.setAttribute("ticket_no", ticket_no);
		mv.setViewName("Payment.jsp");
	
		return mv;
	}

	@RequestMapping("/bookflight")
	public ModelAndView bookFlight(HttpServletRequest request, HttpServletResponse response) {

		
		String flightname = request.getParameter("flightname");
		System.out.println(flightname);
		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession();
		session.setAttribute("flightname", flightname);
		mv.setViewName("flight0.jsp");
		return mv;

	}

}