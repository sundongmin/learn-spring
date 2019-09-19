package com.github.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("index")
public class IndexService {

	@Autowired
	OrderService orderService;

	public void query() {
		System.out.println("indexService");
	}
}
