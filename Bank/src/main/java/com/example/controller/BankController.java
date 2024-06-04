package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.view.RedirectView;
@Controller
public class BankController 
{
	@Autowired
	RestTemplate rs;
	@GetMapping("/index")
	public String index()
	{
		return "index.html";
	}
	@GetMapping("/admin")
		public RedirectView getAdmin() 
	{
		String redirectUrl="http://localhost:8889/admin";
		return new RedirectView(redirectUrl);
			
		}
	@GetMapping("/customer")
	public RedirectView getCustomer()
	{
	String redirectUrl="http://localhost:8890/customer";
	return new RedirectView(redirectUrl);
		
	}
	

}
