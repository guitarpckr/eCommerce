package com.tts.eCommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.tts.eCommerce.service.UserService;

@Controller
public class AdminController {

	@Autowired
	private UserService userService;
}
