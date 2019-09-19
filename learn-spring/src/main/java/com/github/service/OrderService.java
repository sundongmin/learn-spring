package com.github.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("order")
public class OrderService {

	@Autowired
	IndexService indexService;

	public void query() {
		System.out.println("order service");
	}
}
