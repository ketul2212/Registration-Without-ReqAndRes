package com.ketul.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistraionController {

	@RequestMapping("reg")
	public String home(@RequestParam("name") String myName, HttpSession session) {
		session.setAttribute("name", myName);
		return "home.jsp";
	}
	
}
