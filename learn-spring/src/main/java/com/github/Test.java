package com.github;

import com.github.config.AppConfig;
import com.github.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();


		UserService userService = context.getBean(UserService.class);
		userService.query();

	}
}
