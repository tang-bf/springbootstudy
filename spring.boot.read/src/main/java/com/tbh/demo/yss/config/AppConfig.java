package com.tbh.demo.yss.config;


import com.tbh.demo.yss.converter.StringConverterDate;
import com.tbh.demo.yss.viewResolver.MyViewResovler;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.autoconfigure.websocket.servlet.JettyWebSocketServletWebServerCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatContextCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.convert.converter.Converter;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
//@EnableWebMvc
//@EnableAsync
public class AppConfig {



//    @Async
//    public void test(){
//
//        System.out.println(1);
//    }

    //只有在spring boot 这样做才会生效

    @Bean
    public Converter converter(){

        return  new StringConverterDate("yyyy-MM-dd HH:mm:ss");
    }


    //BeanName 必须是这个
//    @Bean("applicationEventMulticaster")
//    public SimpleApplicationEventMulticaster simpleApplicationEventMulticaster(BeanFactory beanFactory,ThreadPoolTaskExecutor poolTaskExecutor){
//        SimpleApplicationEventMulticaster simpleApplicationEventMulticaster
//                = new SimpleApplicationEventMulticaster(beanFactory);
//        simpleApplicationEventMulticaster.setTaskExecutor(poolTaskExecutor);
//        return simpleApplicationEventMulticaster;
//    }
//
//    @Bean
//    public ThreadPoolTaskExecutor poolTaskExecutor(){
//        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
//        threadPoolTaskExecutor.setMaxPoolSize(15);
//        threadPoolTaskExecutor.setCorePoolSize(10);
//        threadPoolTaskExecutor.setQueueCapacity(30);
//        threadPoolTaskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
//        threadPoolTaskExecutor.initialize();
//        return threadPoolTaskExecutor;
//
//    }



//
    @Bean
    public TomcatServletWebServerFactory servletWebServerFactory(){
        //getServletWebServerFactoryBean
        // 如果数组长度大于1 就抛异常
        TomcatServletWebServerFactory
                tomcatServletWebServerFactory = new TomcatServletWebServerFactory();
        tomcatServletWebServerFactory.setPort(80);
        return  tomcatServletWebServerFactory;
    }


//    public static void main(String[] args) {
//        List<WebServerFactoryCustomizer> list = null;
//
//        WebServerFactory factory = null;
//        for (WebServerFactoryCustomizer webServerFactoryCustomizer : list) {
//            webServerFactoryCustomizer.customize(factory);
//        }
//
//
//    }




    //Tomcat Jetty  Netty undertow

    @Bean
    public WebServerFactoryCustomizer customizer(){
        WebServerFactoryCustomizer webServerFactoryCustomizer = new WebServerFactoryCustomizer() {
            //factory 当前正在使用的Web容器factory对象
            @Override
            public void customize(WebServerFactory factory) {
                TomcatServletWebServerFactory factory1 = (TomcatServletWebServerFactory) factory;
//                factory1.setPort();
//
            }
        };
        return webServerFactoryCustomizer;
    }





    @Bean
    public ViewResolver resolver(){

        //这样spring mvc 就会用你的视图解析器了
        return  new MyViewResovler();
    }




}
