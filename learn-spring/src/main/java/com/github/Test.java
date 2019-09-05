package com.github;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();

		IndexService service = context.getBean("index", IndexService.class);
		System.out.println(service);

	}
}
