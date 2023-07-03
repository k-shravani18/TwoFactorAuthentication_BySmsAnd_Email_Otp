package com.security.implementation.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.security.implementation.dto.UserRegisteredDTO;
import com.security.implementation.model.User;


public interface DefaultUserService extends UserDetailsService{

	User save(UserRegisteredDTO userRegisteredDTO);

//	String genrateOTPAndSendOnMobile(User user);
	String generateOtp(User user);

	
}
