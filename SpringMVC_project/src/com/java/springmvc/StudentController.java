package com.java.springmvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}")
	private Map<String,String> countryOptions;
 
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		// create Student class object
		
		Student theStudent= new Student();
		
		// add student object to model
		
	     model.addAttribute("student", theStudent);
	     model.addAttribute("theCountryOptions", countryOptions);
		
	 return "student-form";	
		
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student1") Student alphaStudent) {
		
		System.out.println("alphaStudent:"+" "+alphaStudent.getFirstName()+" "+alphaStudent.getLastName()+" "+alphaStudent.getCountry());
		
		return "confirmation-page";
	}
	
}
