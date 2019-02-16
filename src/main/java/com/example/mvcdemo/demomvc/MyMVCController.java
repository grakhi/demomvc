package com.example.mvcdemo.demomvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyMVCController {

    @RequestMapping("/")
	
	public String showForm() {
		
    	System.out.println("In my MVC method");
		//return "myView";
    	return "hello";
	}
	

    @RequestMapping("/show")
	
   	public String show() {
   		
       	System.out.println("In my MVC showform method");
   		return "myView";
       	
   	}
   	
	
	
	
	
}
