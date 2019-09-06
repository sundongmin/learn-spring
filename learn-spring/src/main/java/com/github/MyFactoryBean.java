package com.github;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

public class MyFactoryBean implements FactoryBean {
	private Class clazz;

	public MyFactoryBean(Class clazz) {
		this.clazz = clazz;
	}

	@Override
	public Object getObject() throws Exception {
		Class[] clazzs = new Class[]{clazz};
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), clazzs, new MyInvocationHandler());
	}

	@Override
	public Class<?> getObjectType() {
		return clazz;
	}

}
