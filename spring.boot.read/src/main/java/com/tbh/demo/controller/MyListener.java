package com.tbh.demo.controller;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.context.event.GenericApplicationListener;
import org.springframework.core.ResolvableType;

/**
 * @ProjectName: spring-boot-build
 * @Package: com.tbh.demo.controller
 * @ClassName: MyListener
 * @Description: 自定义自己的listener
 * @Author: tbf
 * @CreateDate: 2020-08-01 14:12
 * @UpdateUser: Administrator
 * @UpdateDate: 2020-08-01 14:12
 * @UpdateRemark:
 * @Version: 1.0
 */
//在meta-inf/
//也可以自己写一个@componet 类  方法上加上@eventlistener
//处理@eventlistener 注解类是在 preInstantiateSingletons  后/
// Trigger post-initialization callback for all applicable beans...
// SmartInitializingSingleton  afterSingletonsInstantiated
//EventListenerMethodProcessor implements SmartInitializingSingleton, ApplicationContextAware, BeanFactoryPostProcessor
//EventListenerMethodProcessor 这个是在annotationconfigapplicationcontext构造方法中加入的几个开天辟地的rootbeandefinition中
public class MyListener implements GenericApplicationListener
		 {
	public boolean supportsEventType(ResolvableType eventType) {
		//对所有事件都感兴趣
		// 伪代码
//		if(xxxx == eventType ){
//
//		}
		return true;
	}

	public boolean supportsSourceType(Class<?> sourceType) {
		return true;
	}

	public int getOrder() {
		return 0;
	}

	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof ApplicationStartingEvent) {
			System.out.println("自定义listener----");
		}

	}
}
