package org.tnsif.springwebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
* A Controller contains the business logic of an application .
* @controller annotation is used to mark the class as a controller
* */
@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
	    
	System.out.println("Code to demostrate on simple web application");
	return "home.jsp";
	}
}
