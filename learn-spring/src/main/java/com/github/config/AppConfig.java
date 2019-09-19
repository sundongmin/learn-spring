package com.github.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.github")
@EnableAspectJAutoProxy
//@Import(MyImportBeanDefinitionRegistrar.class)
public class AppConfig {

}
