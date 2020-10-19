package com.mindtree.user_service.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.user_service.entity.User;
import com.mindtree.user_service.repository.UserRepository;
import com.mindtree.user_service.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	//@Autowired
	//private UserPreferenceRepository userPreferenceRepository;

	@Override
	public String addNewUser(User user) {
		userRepository.save(user);
		return "Added succesfully";
	}

	@Override
	public boolean checkRoleOfUser(String userId) {
		// boolean b;
		User user = userRepository.getOne(userId);
		if (user.getRole().equalsIgnoreCase("admin")) {
			return true;
		} else {

			return false;
		}
	}

	@Override
	public boolean checkUserLogin(String userName, String password) {
		// TODO Auto-generated method stub
		boolean b = false;
		for (User user : userRepository.findAll()) {
			if (userName.equalsIgnoreCase(user.getUserName()) || password.equalsIgnoreCase(user.getPassword())) {
				b = true;
			} else {
				b = false;
			}
		}
		return b;
	}

}
