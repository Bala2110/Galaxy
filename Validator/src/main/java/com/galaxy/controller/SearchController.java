package com.galaxy.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.galaxy.model.Registration;
import com.galaxy.service.SearchService;


@Controller
public class SearchController{
	@Autowired(required=true)
	@Qualifier(value="searchService")
	private SearchService searchService;
	
	
	public void setSearchService(SearchService ss) {
		this.searchService=ss;
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String listCandidates(Model model) {
		model.addAttribute("search", new Registration());
		//model.addAttribute("listCandidates", searchService.listCandidates(model.));
		return "search";
	}
	
	@RequestMapping(value = "/searchProcess", method = RequestMethod.POST)
	public ModelAndView regProcess(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("search") Registration search) {
		List<Registration> listCandidates = new ArrayList<Registration>();
		String result = "";
		try {

			listCandidates = searchService.listCandidates(search.getName());

		} catch (Exception e) {
			e.printStackTrace();
		}
		ModelAndView model = new ModelAndView("search");
		//model.addObject("lists", list);
		model.addObject("listCandidates", listCandidates);
		return model;
	}
}