package com.github.context;

import com.github.factory.MyFactoryBean;
import com.github.service.CarService;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(CarService.class);
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) builder.getBeanDefinition();
		System.out.println(beanDefinition.getBeanClassName());

		beanDefinition.setBeanClass(MyFactoryBean.class);
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.github.service.CarService");
		registry.registerBeanDefinition("carService", beanDefinition);
	}
}
