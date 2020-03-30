package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.models.Role;

import fr.formation.repository.IRoleRepository;
@Service
public class RoleService implements IRoleService{
	@Autowired
	IRoleRepository rolerepository;
	@Override
	public List<Role> getAllRole() {
return rolerepository.findAll();
	}

	@Override
	public Role getRoleById(long id) {
		Optional<Role> Role1 =rolerepository.findById(id);
		Role Role = new Role();
		if(Role1.isPresent()) {
			Role=Role1.get()
;		}
		return Role;
	}

	@Override
	public Role createRole(Role role) {
	return rolerepository.save(role);
	}

}
