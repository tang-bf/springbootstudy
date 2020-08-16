package com.tbh.demo.yss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;

@RestController
public class TestController {


    //犯贱： 如果我不要spring boot帮我们自动配置spring mvc怎么办?

    @RequestMapping("test")  //2019-01-01 12:01:22
    public Object test(Date date){
        System.out.println(date.getTime());
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("xx","aaa");
        return hashMap;
    }





}
