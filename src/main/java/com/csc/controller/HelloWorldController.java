package com.csc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloWorldController {

	@RequestMapping(value = "welcomePage.htm")
	protected ModelAndView welcome(HttpServletRequest rq,
			HttpServletResponse res) throws Exception {
		String msg = "Welcome to ssHello World!!!";
		return new ModelAndView("welcomePage", "welcomeMessage", msg);
	}
}
