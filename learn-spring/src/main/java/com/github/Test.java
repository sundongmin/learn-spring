package com.github;

import com.github.config.AppConfig;
import com.github.service.CarService;
import com.github.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();

		AppConfig appConfig = context.getBean(AppConfig.class);

		IndexService service = context.getBean("index", IndexService.class);
		System.out.println(service);

		CarService carService = (CarService) context.getBean("carService");
		carService.printColor();

	}
}
