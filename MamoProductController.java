package com.example.MamoDemoProject;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MamoProductController {
	
	@Autowired
	private ProductUser userService;

	@PostMapping("/addUser")
	public ListProduct addUser(@RequestBody ListProduct user) {
	   return userService.createUser(user);
	}

	@PostMapping("/addUsers")
	public List<ListProduct> addUsers(@RequestBody List<ListProduct> users) {
		return userService.createUsers(users);
	}

	@GetMapping("/user/{id}")
	public ListProduct getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}

	@GetMapping("/users")
	public List<ListProduct> getAllUsers() {
		return userService.getUsers();
	}
	
	@PutMapping("/updateuser")
	public ListProduct updateUser(@RequestBody ListProduct user) {
		return userService.updateUser(user);
	}

	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable int id) {
		return userService.deleteUserById(id);
	}

}
