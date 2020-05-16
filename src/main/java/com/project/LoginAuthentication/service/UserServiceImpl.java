package com.project.LoginAuthentication.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.LoginAuthentication.dao.RoleRepository;
import com.project.LoginAuthentication.dao.UserRepository;
import com.project.LoginAuthentication.entity.UserInfo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public void RegisterUser(UserInfo user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
		
		userRepository.save(user);
		
	}
}
