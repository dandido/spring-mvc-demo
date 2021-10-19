package com.spring.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Form") // parent controller
public class HelloWorldController {
	
	//Show init HTML
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
		
	}
	
	
	
	@RequestMapping("/processForm")
	public String meth() {
		return "helloworld";
		
	}
	
	
	@RequestMapping("/processFormVersion2")
	public String letDoit(HttpServletRequest httpServletRequest , Model model) {
		//read request param from HTML Form
		String theName = httpServletRequest.getParameter("studentName");
		//convert to all caps
		theName = theName.toUpperCase();
		//create the message
		String result = "Yo ! "+ theName;
		//add message to the model
		model.addAttribute("message",result);
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormVersion3")
	public String letDoitv2(@RequestParam("studentName") String theName , Model model) {
		//convert to all caps
		theName = theName.toUpperCase();
		//create the message
		String result = "Yo ! "+ theName + "   From V3";
		//add message to the model
		model.addAttribute("message",result);
		return "helloworld";
	}
	

}
