package fr.formation.service;

import java.util.List;

import fr.formation.models.User;

public interface IUserService {

	public List<User> getAllUser();
	public User getUserById(long id);
	public User createUser(User user);
	public long deleteUser(long id);
	public User updateUser(User user);
	public User identification(String nomuser, String password);

}
