package com.czg.test;

import com.czg.apps.App;
import com.czg.services.X;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		//初始化spring 容器
		AnnotationConfigApplicationContext a = new AnnotationConfigApplicationContext(App.class);
		System.out.println(a.getBean(X.class));

		//scan
		a.scan("com.czg");
	}
}
