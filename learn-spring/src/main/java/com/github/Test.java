package com.github;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.register(IndexService.class);

		IndexService service = context.getBean("index", IndexService.class);
		System.out.println(service);

	}
}
