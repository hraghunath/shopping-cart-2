package com.shoopingcart.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shoopingcart.app.entities.User;
import com.shoopingcart.app.services.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	//http://localhost:8080/create
	@RequestMapping(value="/create",method = RequestMethod.GET)
	public String viewCreateUserCart () {
		return "create_user";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveOneUser(@ModelAttribute("user")User user,Model model) {
		userService.saveUserInformation(user);
		model.addAttribute("user",user);
		model.addAttribute("message", "user is saved");
		return "user_info";
	}
	//http://localhost:8080/listusers
	@RequestMapping("/listusers")
	public String listUsers(Model model) {
		List<User> users = userService.getAllUsers();
		model.addAttribute("users",users);
		return "list_users";
		
	}

}
