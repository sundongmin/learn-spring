package com.github.config;

import com.github.context.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.github")
@EnableAspectJAutoProxy
@Import(MyImportBeanDefinitionRegistrar.class)
public class AppConfig {

}
