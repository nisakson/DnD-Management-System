package com.revature.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.User;
import com.revature.repositories.UserRepository;


@Service("userService")
public class UserService {
	private UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {

		this.userRepository = userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void save(User user) {
		this.userRepository.save(user);
	}

	public User findByUsername(String username) {
		return this.userRepository.findByUsername(username);
	}

	public User findByUsernameAndPassword(String username, String password) {
		User user = this.userRepository.findByUsernameAndPassword(username, password);
		if (user == null) {
			//TODO: Message to send to View. Either here or UserController
			return null; 
		}
		else
			return user;
	}
	
	
	  public User findById(int id) { 
		  return this.userRepository.getById(id);
	  
	  }
	 

	/*
	 * public List<User> findAll(){ return this.userRepository.findAll(); }
	 * 
	 * public void save(User user) { this.userRepository.save(user); }
	 * 
	 * 
	 */
}
