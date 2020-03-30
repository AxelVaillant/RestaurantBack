package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.models.User;
import fr.formation.repository.IUserRepository;
@Service
public class UserService implements IUserService{
	@Autowired
	IUserRepository userrepository;
	@Override
	public List<User> getAllUser() {
	return userrepository.findAll();
	}

	@Override
	public User getUserById(long id) {
		Optional<User> user1 =userrepository.findById(id);
		User user = new User();
		if(user1.isPresent()) {
			user=user1.get()
;		}
		return user;
	}

	@Override
	public User createUser(User user) {
		return userrepository.save(user);
	}

	@Override
	public long deleteUser(long id) {
		try {
			userrepository.deleteById(id);
		} catch (Exception e) {
			return 0;
		}
		return 1;
	}

	@Override
	public User updateUser(User user) {
		return userrepository.save(user);
	}

	@Override
	public User identification(String nomuser, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
