package com.example.demo;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MainController {
 
  @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(Locale locale, Model model) {
         
	  	
        
        model.addAttribute("usr", 123 );
 
        return "index";
    }
 
}