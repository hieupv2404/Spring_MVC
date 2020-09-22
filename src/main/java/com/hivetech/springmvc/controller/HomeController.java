package com.hivetech.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = { "/", "/home" })
	public String home() {
		return "home";
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String doGet() {
		return "test1";
	}

	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String doPost() {
		return "test2";
	}

	@RequestMapping(value = "/method0", headers = "name=kai")
	public String method0() {
		return "page0";
	}

	@RequestMapping(value = "/method1", headers = { "name=kai", "id=1" })
	public String method1() {
		return "page1";
	}

	@RequestMapping(value = "/method2", produces = { "application/json"}, consumes = "text/html")
	public String method2() {
		return "page2";
	}

}
