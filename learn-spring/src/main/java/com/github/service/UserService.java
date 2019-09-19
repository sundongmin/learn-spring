package com.github.service;

import org.springframework.stereotype.Service;

@Service("user")
public class UserService {
	public void query() {
		System.out.println("user service");
	}
}
