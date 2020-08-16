package com.tbh.demo.yss.listener;

import com.luban.bean.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class TestListener {



    //ContextRefreshedEvent：Spring 容器Refreshed了事件
    @EventListener
    public void t(ContextRefreshedEvent e){
        ApplicationContext source = (ApplicationContext) e.getSource();
        System.out.println("容器Refreshed了:"+source);

    }



}
