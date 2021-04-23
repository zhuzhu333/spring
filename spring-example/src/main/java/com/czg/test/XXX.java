package com.czg.test;

import com.czg.services.Y;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;
//自定义工厂后置处理器
@Component
public class XXX implements BeanFactoryPostProcessor {

	//spring完成扫描之后就会去执行 自己实现的BeanFactoryPostProcessor（bean工场的后置处理器，可以干预bean工场的初始化过程）
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		//封装bean的对象，扩展描述对象的属性，比如bean的注入类型，描述，加载方式，作用域
		//可以自己实现
		GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition)beanFactory.getBeanDefinition("x");
		genericBeanDefinition.setBeanClass(Y.class);
		genericBeanDefinition.setDescription("dqfqf");
		System.out.println("dqqfqf");
	}
}
