package com.tbh.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

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

@SpringBootApplication
public class TBHSpringBootDemo {
	public static void main(String[] args) {
		//首先会new 一个SpringApplication 会初始化一些initilizer  和applicationListener
		//并且判断webapplicationType  和mainclass是哪个类，有可能配置类和启动类不是同一个
//		@SpringBootApplication
//		public class xxxxx{
//
//		}
//		SpringApplication.run(xxxx.class,args);
		SpringApplication.run(TBHSpringBootDemo.class,args);
	}
}
