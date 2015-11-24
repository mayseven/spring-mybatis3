package com.yxq.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yxq.model.User;
import com.yxq.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	

	@RequestMapping("/getUser")
	public ModelAndView getUser(HttpServletRequest req, HttpServletResponse response){
		
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("message","Hello World");
		User u=userService.getUserById(1);
		mv.addObject("user",u);
		mv.setViewName("hello");
		return mv;
			
		
	}
	
	@RequestMapping("/getUserList")
	public ModelAndView getUserList(HttpServletRequest req, HttpServletResponse response){
		
		
		ModelAndView mv = new ModelAndView();
	
		User user= new User();
		List<User> u=userService.getUserList( user);
		mv.addObject("userlist",u);
		mv.setViewName("list");
		return mv;
			
		
	}
	
}
