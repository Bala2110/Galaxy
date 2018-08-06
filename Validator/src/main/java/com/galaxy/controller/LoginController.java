package com.galaxy.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.galaxy.model.Index;
import com.galaxy.service.UserService;


@Controller
public class LoginController 
{

	@Autowired(required=true)
	@Qualifier(value="userService")
	private UserService userService;
	
	
	public void setUserService(UserService us) {
		this.userService=us;
	}

	

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin(HttpServletRequest request, HttpServletResponse response,Model model) {
		
		model.addAttribute("login", new Index());
		return "index";
	}

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public String loginProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("login") Index login) {
		ModelAndView model = null;
		
		String redirect = "";
		try {

			boolean isValidUser = userService.isValidUser(login.getUserName(), login.getPassword());
			if (isValidUser) {
				redirect="dashboard";
				System.out.println("success");
			} else {
				System.out.println("Invalid user");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return redirect;
	}

}
