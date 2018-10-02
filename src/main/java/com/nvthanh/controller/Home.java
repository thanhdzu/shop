package com.nvthanh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ModelAndView home(ModelMap modelMap) {

		ModelAndView andView = new ModelAndView();
		andView.setViewName("home");

		return andView;
	}

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public ModelAndView login(ModelMap modelMap) {

		ModelAndView andView = new ModelAndView();
		andView.setViewName("login");

		return andView;
	}
}
