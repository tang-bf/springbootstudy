package com.tbh.demo.controller;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationEvent;
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
