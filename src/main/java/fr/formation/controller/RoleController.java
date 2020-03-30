package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.models.Role;
import fr.formation.service.IRoleService;

@RestController
@RequestMapping("role")
@CrossOrigin("http://localhost:4200")
public class RoleController {
	@Autowired
	IRoleService roleservice;
	
	@GetMapping("/all")
	public List<Role> getAllRole(){
		return roleservice.getAllRole();
	}
	
	@GetMapping("/byid/{id}")
	public Role getRolebyid(@PathVariable long id) {
		return roleservice.getRoleById(id);
	}

	@PostMapping("/save")
	public Role createRole(@RequestBody Role role) {
		return roleservice.createRole(role);
	}
}
