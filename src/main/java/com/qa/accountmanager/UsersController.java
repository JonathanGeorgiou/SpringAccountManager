package com.qa.accountmanager;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
		
	@Autowired
	private UsersService service;
	
	@PostMapping("/createUser")
	public Users createUser (@RequestBody Users user) {
		return this.service.createUser(user);
	}
	
	@GetMapping("/getUsers")
	public List<Users> readUsers() {
		return this.service.readUsers();
		
	}
	@PutMapping("/updateUser")
	public Users updateUser(@PathParam ("id")Long id, @RequestBody Users user ) {
		return this.service.updateUser(user, id);
		
	}
	@DeleteMapping("/deleteUser/{id}")
	public void deleteUser(@PathVariable Long id) {
		this.service.deleteUser(id);
	}
	    	

}
