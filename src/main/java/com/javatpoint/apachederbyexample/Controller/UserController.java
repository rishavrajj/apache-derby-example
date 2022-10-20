package com.javatpoint.apachederbyexample.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.apachederbyexample.Model.UserRecord;
import com.javatpoint.apachederbyexample.Service.UserService;

@RestController
public class UserController {
	
	@Autowired    
	private UserService userService;
	
	@GetMapping("/")
	public List<UserRecord> getAllUser()  
	{    
	return userService.getAllUsers();    
	}
	
	@PostMapping("/add-user")    
	public void addUser(@RequestBody UserRecord userRecord)  
	{    
		userService.addUser(userRecord);    
	} 
	
}
