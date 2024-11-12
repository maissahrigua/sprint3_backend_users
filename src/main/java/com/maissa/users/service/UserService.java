package com.maissa.users.service;

import java.util.List;

import com.maissa.users.entities.Role;
import com.maissa.users.entities.User;
import com.maissa.users.service.register.RegistationRequest;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();
	User registerUser(RegistationRequest request);
	//envoyer par email pour valider l'email de l'utilisateur
	public void sendEmailUser(User u, String code);
	public User validateToken(String code);
}