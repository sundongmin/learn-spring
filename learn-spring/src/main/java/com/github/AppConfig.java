package com.github;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.github")
@Import(MyImportBeanDefinitionRegistrar.class)
public class AppConfig {

}
