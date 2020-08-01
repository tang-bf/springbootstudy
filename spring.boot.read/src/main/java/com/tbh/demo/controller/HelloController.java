package com.tbh.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: HelloController
 * @Description:
 * @Author: tbf
 * @CreateDate: 2020-07-22 21:24
 * @UpdateUser: Administrator
 * @UpdateDate: 2020-07-22 21:24
 * @UpdateRemark:
 * @Version: 1.0
 */
@Controller
//@RestController
@RequestMapping("/c1")
public class HelloController {
    //@RequestMapping("/hello")
   // @ResponseBody
   // @PostMapping
    public String hello(){
        return  "hello spring boot";
    }
    @GetMapping("/hello2")
   // @ResponseBody
    public  String love(){
        return  "index";
    }
    @GetMapping("/date")
     @ResponseBody
    public Date date(Date myDate){
        return myDate;
    }
}
