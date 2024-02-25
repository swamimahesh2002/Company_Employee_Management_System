package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Emp;
import com.app.service.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	EmpService eserv; 
	
	@GetMapping("/")
	public String showHome() 
	{
		return "/home";
	}
	
	@GetMapping("/register")
	public String showRegister() {
		
		return "/register";
		
	}
	@GetMapping("/dashboard")
	public String showdashboard(ModelMap map) {
		
		List<Emp>allEmp=eserv.getAll();
		System.out.println(allEmp);
		map.addAttribute("vlist", allEmp);
		return "/dashboard";
		
	}
	
	@PostMapping("/registerUser")
	public String registeruser(@RequestBody Emp emp, RedirectAttributes flashMap) 
	{
		System.out.println("after registration "+emp);
		flashMap.addFlashAttribute("msg", "Successfully Registred..!! View table !");
		eserv.addEmp(emp);
		return "redirect:/";
	}
	
	
	public int addition(int a, int b) {
		return a+b;
	}

}
