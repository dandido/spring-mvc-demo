package com.spring.demo.StudentData;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//create current student
		Student theStudent = new Student();
		//add studnet object to the model
		theModel.addAttribute("student",theStudent);
		return "student-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println("theStudent : first name is : "+theStudent.getFirstName() +"  and the last name is : "+theStudent.getLastName());
		System.out.println("theStudent : is from : "+theStudent.getCountry());

		return "student-confirmation";
	}


}
