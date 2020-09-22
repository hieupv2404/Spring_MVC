package com.hivetech.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class BaseController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/test1")
//	@ResponseBody
	public String test1() {
		return "test1";
	}
}
