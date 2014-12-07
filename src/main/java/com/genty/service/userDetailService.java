package com.genty.service;

import javax.annotation.Resource;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.genty.Mapper.UserMapper;
import com.genty.model.User;

@Service
public class userDetailService implements UserDetailsService {
	@Resource
    private UserMapper usermapper;
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		System.out.println("==================");
		User u =usermapper.selectUserByname(username);
		
		System.out.println(u.getRole());
		return u;
	}

}
