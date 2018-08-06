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

import com.galaxy.model.Registration;
import com.galaxy.service.AddService;



@Controller
public class AddController 
{

	@Autowired(required=true)
	@Qualifier(value="addService")
	private AddService addService;
	
	
	public void setAddService(AddService as) {
		this.addService=as;
	}

	

	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public String showRegistration(HttpServletRequest request, HttpServletResponse response,Model model) {
		
		model.addAttribute("reg", new Registration());
		return "registration";
	}
	
	@RequestMapping(value = "/regProcess", method = RequestMethod.POST)
	public ModelAndView regProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("reg") Registration reg) {
		
		String result="";
		try {

			boolean candidateDetails = addService.candidateDetails(reg);
			System.out.println(candidateDetails);
			if (candidateDetails) {
				System.out.println("Registration successfull");
				result= "Registration Successfull";
				
			} else {
				result= "Registration Failed";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		ModelAndView model = new ModelAndView("registration");
		//model.addObject("lists", list);
		model.addObject("result", result);
		return model;
	}

	
}
