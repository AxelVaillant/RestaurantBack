package fr.formation.service;

import java.util.List;

import fr.formation.models.Role;


public interface IRoleService {

	public List<Role> getAllRole();
	public Role getRoleById(long id);
	public Role createRole(Role role);

}
