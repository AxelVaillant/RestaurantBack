package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import fr.formation.models.User;
import fr.formation.service.IUserService;

@RestController
@RequestMapping("user")
@CrossOrigin("http://localhost:4200")
public class UserController {
	
	@Autowired
	IUserService userservice;
	
	@GetMapping("/all")
	public List<User> getAllUser(){
		return userservice.getAllUser();
	}
	
	@GetMapping("/byid/{id}")
	public User getUserbyid(@PathVariable long id) {
		return userservice.getUserById(id);
	}

	@PostMapping("/save")
	public User createUser(@RequestBody User user) {
		return userservice.createUser(user);
	}
	
	@PostMapping("/delete/{id}")
	public long deleteUser(@PathVariable long id) {
		return userservice.deleteUser(id);
	}
	@PutMapping("/update/{id}")
	public User updateUser(@PathVariable long id, @RequestBody User user) {
		User usermodif=userservice.getUserById(id);
		usermodif.setNomuser(user.getNomuser());
		usermodif.setPrenomuser(user.getPrenomuser());
		usermodif.setPassword(user.getPassword());
		usermodif.setRole(user.getRole());
		return userservice.updateUser(user);
	}
	
}
