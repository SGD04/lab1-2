package com.polytech.account.service;

/**
 * Created by Sergio on 14/04/2017.
 */
public interface SecurityService {
	String findLoggedInUsername();

	void autologin(String username, String password);
}
