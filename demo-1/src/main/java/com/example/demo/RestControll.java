package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.batch.StaticV;

@RestController
public class RestControll {

	private static int sessionNum = 3;
	   	  
	@RequestMapping(value = "/tokenVerify", method = RequestMethod.GET)
	public String tokenVerify(HttpServletRequest request, Model model, HttpServletResponse response){			
		return "<script>alert('yesy" + 123 + "')</script>";
	}
	
	@RequestMapping(value = "/sessionGet", method = RequestMethod.GET)
	public String sessionGet(HttpServletRequest request, Model model, HttpServletResponse response){
		
		sessionNum--;
		StaticV.minus();;
		
		if(sessionNum > 0) { 
			return "<script>alert('your session number is " + StaticV.getSessionV() + "')</script>";
		}else {
			return "<script>alert('your session number is exhasted')</script>";
		}
	}
	
	@RequestMapping(value = "/sessionLeave", method = RequestMethod.GET)
	public String sessionLeave(HttpServletRequest request, Model model, HttpServletResponse response){
		
		sessionNum++;
		StaticV.plus();;
		return "sessionNum " + StaticV.getSessionV();
	}
}
