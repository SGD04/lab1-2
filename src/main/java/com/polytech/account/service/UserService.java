package com.polytech.account.service;


import com.polytech.account.models.User;

/**
 * Created by Sergio on 14/04/2017.
 */
public interface UserService {
	void save(User user);

	User findByUsername(String username);
}
