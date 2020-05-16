package com.project.LoginAuthentication.service;

public interface SecurityService {

	String findLoggedInUsername();
	
	void autoLogin(String username, String password);
	
}
