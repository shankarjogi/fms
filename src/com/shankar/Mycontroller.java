package com.shankar;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shankar.entity.Login;

@Controller
public class Mycontroller {

	
	@RequestMapping("/login") 
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("Hi");
		
		if((username.equals(username)) && (password.equals(DaoFactory.getPassword(username))))
		{
			ModelAndView mv = new ModelAndView();
			mv.addObject("sh", username);
			mv.addObject("s", password);
			mv.setViewName("welcome.jsp");
			return mv;
		}
		if(DaoFactory.getPassword(username).equals("InvalidUsername")) {
			System.out.println("Invalid Username");
			response.sendRedirect("login.jsp");
		}

		else
		{
//		response.sendRedirect("login.jsp");
	
		}
		return null;
		
	}
  //CODE FOR NEW REGISTER

	@RequestMapping("/register")
	public ModelAndView SignUp(HttpServletRequest request, HttpServletResponse response) {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Login userdata=new Login();
		userdata.setUsername(username);
		userdata.setPassword(password);
		DaoFactory.registerUser(userdata);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("login.jsp");
		mv.addObject("Register","Registration Successful");
		return mv;
		
	}

	// 
	@RequestMapping("/SearchFlight")
	public ModelAndView Search(HttpServletRequest request, HttpServletResponse response) {
		String source=request.getParameter("source");
		String destination=request.getParameter("destination");
		System.out.println(source+" "+destination);
		DaoFactory.getFlights(source, destination);
		return null;
		
	}
	
	
	
}