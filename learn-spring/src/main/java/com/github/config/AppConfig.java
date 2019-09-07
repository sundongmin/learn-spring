package com.github.config;

import com.github.service.OrderService;
import com.github.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.github")
//@Import(MyImportBeanDefinitionRegistrar.class)
public class AppConfig {

	@Bean
	public UserService userService() {
		return new UserService();
	}

	@Bean
	public OrderService orderService() {
		userService();
		return new OrderService();
	}
}
