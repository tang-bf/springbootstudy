package com.tbh.demo.controller;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: spring-boot-build
 * @Package: com.tbh.demo.controller
 * @ClassName: EventListenerTest
 * @Description:
 * @Author: tbf
 * @CreateDate: 2020-08-15 16:47
 * @UpdateUser: Administrator
 * @UpdateDate: 2020-08-15 16:47
 * @UpdateRemark:
 * @Version: 1.0
 */
//处理@eventlistener 注解类是在 preInstantiateSingletons  后
// Trigger post-initialization callback for all applicable beans...
// SmartInitializingSingleton  afterSingletonsInstantiated
//EventListenerMethodProcessor implements SmartInitializingSingleton, ApplicationContextAware, BeanFactoryPostProcessor
//EventListenerMethodProcessor 这个是在annotationconfigapplicationcontext构造方法中加入的几个开天辟地的rootbeandefinition中
//是new了一个新的bean  ApplicationListenerMethodAdapter
/**context.addApplicationListener(applicationListener);
 * 在finishRefresh(); 中publishEvent(new ContextRefreshedEvent(this));
 * getApplicationEventMulticaster().multicastEvent(applicationEvent, eventType);
 * doinvoke调用
 */
@Service
public class EventListenerTest {
	@EventListener
	public void annotationEvent(ApplicationEvent event){
		System.out.println("UserService。。监听到的事件："+event);
	}
}
