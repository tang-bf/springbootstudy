package com.tbh.demo.yss.init;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
//springboot 使用内嵌容器此时可以被调用
@Component
public class SpringBootWebInit  implements ServletContextInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println(2);
    }
}
