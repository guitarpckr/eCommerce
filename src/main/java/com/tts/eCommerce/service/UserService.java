package com.tts.eCommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tts.eCommerce.repository.RoleRepository;
import com.tts.eCommerce.repository.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;
	private RoleRepository roleRepository;
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
@Autowired
	public UserService(UserRepository userRepository,
			RoleRepository roleRepository,
			BCryptPasswordEncoder bCryptPasswordEncoder) {
			this.userRepository = userRepository;
			this.roleRepository = roleRepository;
		    this.bCryptPasswordEncoder = bCryptPasswordEncoder;
}

}