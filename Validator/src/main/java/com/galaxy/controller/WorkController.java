package com.galaxy.controller;

import java.util.ArrayList;
import java.util.List;

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
import com.galaxy.service.WorkService;

@Controller
public class WorkController {
	
	@Autowired(required=true)
	@Qualifier(value="workService")
	private WorkService workService;
	
	
	public void setWorkService(WorkService ws) {
		this.workService=ws;
	}
	
	@RequestMapping(value="/work" ,method=RequestMethod.GET)
	public String listCandidates(Model model) {
		model.addAttribute("work", new Registration());
		//model.addAttribute("listCandidates", searchService.listCandidates(model.));
		return "workflow";
	}
	
	@RequestMapping(value = "/registered", method = RequestMethod.POST)
	public ModelAndView registered(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("work") Registration work) {
		List<Registration> listCandidates = new ArrayList<Registration>();
		String result = "";
		try {

			listCandidates = workService.listCandidates(work.getName());

		} catch (Exception e) {
			e.printStackTrace();
		}
		ModelAndView model = new ModelAndView("workflow");
		//model.addObject("lists", list);
		model.addObject("listCandidates", listCandidates);
		return model;
	}
	
	/*@RequestMapping(value = "/inProgress", method = RequestMethod.POST)
	public ModelAndView inProgress(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("work") Registration work) {
		List<Registration> listCandidates = new ArrayList<Registration>();
		String result = "";
		try {

			listCandidates = workService.listCandidates(work.getName());

		} catch (Exception e) {
			e.printStackTrace();
		}
		ModelAndView model = new ModelAndView("work");
		//model.addObject("lists", list);
		model.addObject("listCandidates", listCandidates);
		return model;
	}

	@RequestMapping(value = "/highPriority", method = RequestMethod.POST)
	public ModelAndView highPriority(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("work") Registration work) {
		List<Registration> listCandidates = new ArrayList<Registration>();
		String result = "";
		try {

			listCandidates = workService.listCandidates(work.getName());

		} catch (Exception e) {
			e.printStackTrace();
		}
		ModelAndView model = new ModelAndView("work");
		//model.addObject("lists", list);
		model.addObject("listCandidates", listCandidates);
		return model;
	}
	
	@RequestMapping(value = "/lowPriority", method = RequestMethod.POST)
	public ModelAndView lowPriority(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("work") Registration work) {
		List<Registration> listCandidates = new ArrayList<Registration>();
		String result = "";
		try {

			listCandidates = workService.listCandidates(work.getName());

		} catch (Exception e) {
			e.printStackTrace();
		}
		ModelAndView model = new ModelAndView("work");
		//model.addObject("lists", list);
		model.addObject("listCandidates", listCandidates);
		return model;
	}
	
	@RequestMapping(value = "/completed", method = RequestMethod.POST)
	public ModelAndView completed(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("work") Registration work) {
		List<Registration> listCandidates = new ArrayList<Registration>();
		String result = "";
		try {

			listCandidates = workService.listCandidates(work.getName());

		} catch (Exception e) {
			e.printStackTrace();
		}
		ModelAndView model = new ModelAndView("work");
		//model.addObject("lists", list);
		model.addObject("listCandidates", listCandidates);
		return model;
	}
	
	@RequestMapping(value = "/rejected", method = RequestMethod.POST)
	public ModelAndView rejected(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("work") Registration work) {
		List<Registration> listCandidates = new ArrayList<Registration>();
		String result = "";
		try {

			listCandidates = workService.listCandidates(work.getName());

		} catch (Exception e) {
			e.printStackTrace();
		}
		ModelAndView model = new ModelAndView("work");
		//model.addObject("lists", list);
		model.addObject("listCandidates", listCandidates);
		return model;
	}*/
}
