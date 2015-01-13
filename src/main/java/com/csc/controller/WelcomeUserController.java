package com.csc.controller;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class WelcomeUserController {
	@RequestMapping(value = "/welcomeUser")
	protected ModelAndView welcomeUser(HttpServletRequest rq,
			HttpServletResponse res) {
		ModelAndView mv = new ModelAndView("welcomeUser");
		mv.addObject("welcomeMessage", "The man with no name?");
		mv.addObject("user", new User());
		return mv;
	}

	@RequestMapping(value = "/welcomeUserSubmit")
	protected String submit(@ModelAttribute("user") User user,
			BindingResult result, Model model) {
		String msg = "";
		if (result.hasErrors()) {
			msg = "The field '" + result.getFieldError().getField()
					+ "' is not valid.";
		} else {
			msg = "Welcome " + user.getFullName();
		}
		model.addAttribute("welcomeMessage", msg);
		return "welcomeUser";
	}
}
