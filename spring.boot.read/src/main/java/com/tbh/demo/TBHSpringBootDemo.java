package com.tbh.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cglib.core.Converter;

/**
 * @ProjectName: spring-boot-build
 * @Package: com.tbh.demo
 * @ClassName: TBHSpringBootDemo
 * @Description:
 * @Author: tbf
 * @CreateDate: 2020-08-01 12:13
 * @UpdateUser: Administrator
 * @UpdateDate: 2020-08-01 12:13
 * @UpdateRemark:
 * @Version: 1.0
 */

/**
 * springboot 使用内嵌的tomcat的话不会直接使用servlet3.0的特性 （spi机制  meta/inf ja）详解见另一个springboot源码
 * 解析；
 * 官网注释 内嵌的selrvlet容器不会直接执行servlet3.0规范的。。。。
 * Embedded servlet containers do not directly execute
 * the Servlet 3.0+ javax.servlet.ServletContainerInitializer i
 * nterface or Spring’s org.springframework.web.WebApplicationInitializer interface.
 * This is an intentional design decision intended to reduce the risk that third party libraries
 * designed to run inside a war may break Spring Boot applications.
 * If you need to perform servlet context initialization in a Spring Boot application,
 * you should register a bean that
 * implements the org.springframework.boot.web.servlet.ServletContextInitializer interface.
 * The single onStartup method provides access to the ServletContext and,
 * if necessary, can easily be used as an adapter to an existing WebApplicationInitializer.
 * @HandlesTypes(WebApplicationInitializer.class)
 * public class SpringServletContainerInitializer
 */
@SpringBootApplication
public class TBHSpringBootDemo { // extends SpringBootServletInitializer
	// Note that a WebApplicationInitializer is only needed if you are building a war file and
   //* deploying it. If you prefer to run an embedded web server then you won't need this at
	//		* all. 打成war包
	/**
	 *  @Override
	 *     protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	 *         return builder.sources(TBHSpringBootDemo.class);
	 *     }
	 * @param args
	 */
	public static void main(String[] args) {
		//首先会new 一个SpringApplication 会初始化一些ApplicationContextInitializer  和applicationListener
		//并且判断webapplicationType  和mainclass是哪个类，有可能配置类和启动类不是同一个
//		@SpringBootApplication
//		public class xxxxx{
//
//		}
//		SpringApplication.run(xxxx.class,args);
		/**
		 * SpringMVC中，可以使用@RequestBody和@ResponseBody两个注解，分别完成请求报文到对象和对象到响应报文的转换，
		 * 底层这种灵活的消息转换机制就是利用HttpMessageConverter来实现的，
		 * pring内置了很多HttpMessageConverter，比如MappingJackson2HttpMessageConverter，
		 * StringHttpMessageConverter等，下面我们来自定义自己的消息转换器来满足自己特定的需求，
		 * 有两种方式：1、使用spring或者第三方提供的现成的HttpMessageConverter，2、自己重写一个HttpMessageConverter。
		 */
		//Converter 接口
		/**
		 * pring提供了3种converter接口,分别是Converter、ConverterFactory和GenericConverter.
		 * 一般用于1:1, 1:N, N:N的source->target类型转化。
		 * Converter接口 ：使用最简单，最不灵活；
		 * ConverterFactory接口 ：使用较复杂，比较灵活；
		 * GenericConverter接口 ：使用最复杂，也最灵活；
		 * Converter
		 * Converter的实现类举例：该接口Spring内部的实现也非常多，
		 * 大多数都是以内部类的形式实现（因为它是一个@FunctionalInterface嘛）
		 * ConditionalConverter 3.2之后才有
		 */
		SpringApplication.run(TBHSpringBootDemo.class,args);
	}
}
