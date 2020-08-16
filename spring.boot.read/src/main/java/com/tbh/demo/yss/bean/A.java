package com.tbh.demo.yss.bean;


import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(B.class)
public class A {
}
