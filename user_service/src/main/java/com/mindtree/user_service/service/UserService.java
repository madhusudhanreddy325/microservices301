package com.mindtree.user_service.service;

import org.springframework.stereotype.Service;

import com.mindtree.user_service.entity.User;

@Service
public interface UserService {

	String addNewUser(User user);

	boolean checkRoleOfUser(String userId);

	boolean checkUserLogin(String userName, String password);

}
