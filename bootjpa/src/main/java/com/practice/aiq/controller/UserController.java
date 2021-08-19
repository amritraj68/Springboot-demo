package com.practice.aiq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.practice.aiq.dao.UserRepo;
import com.practice.aiq.model.UserRegistration;

@Controller
public class UserController
{
	@Autowired
	UserRepo repo;

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp"; 
	}
	
	@PostMapping("/registerUser")
	public String addAlien(UserRegistration user)
	{
	    repo.save(user);
		return "home.jsp";
	}
	
	@GetMapping("/displayUser")
	public ModelAndView displayUser(@RequestParam int userId)
	{
		ModelAndView mv = new ModelAndView("displayUsers.jsp");
		
		UserRegistration user = repo.findById(userId).orElse(new UserRegistration());
		
		mv.addObject(user);
		
		return mv ;
	}
}
