package com.java.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @RequestMapping("/displayForm")
	public String showForm() {
		return "helloWorld_form";
	}
    
    @RequestMapping("/processForm")
    public String confirmPage() {
    	return "confirmation_page";
    }
	
    @RequestMapping("/processForm2")
    public String processFormVersionTwo(HttpServletRequest request,Model model) {
    
    	//read form data
    	String theName= request.getParameter("studentName");
    	
    	//convert it into uppercase
    	
    	theName= theName.toUpperCase();
    	
    	// create message
    	String result= "Yo!"+" "+theName;
    	
    	//adding data to model
    	
    	model.addAttribute("message", result);
    	
    	return "confirmation_page";
    	
    }
    
    @RequestMapping("/processForm3")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
    	
        //convert it into uppercase
    	
    	theName= theName.toUpperCase();
    	
    	// create message
    	String result= "Yo!"+" "+theName;
    	
    	//adding data to model
    	
    	model.addAttribute("message", result);
    	
    	
    	return "confirmation_page";
    
    }
	
}
