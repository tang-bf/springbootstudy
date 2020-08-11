package com.tbh.demo.tbh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring-boot-build
 * @Package: com.tbh.demo.tbh
 * @ClassName: Order
 * @Description:
 * @Author: tbf
 * @CreateDate: 2020-08-10 22:12
 * @UpdateUser: Administrator
 * @UpdateDate: 2020-08-10 22:12
 * @UpdateRemark:
 * @Version: 1.0
 */
@PropertySource("classpath:order.yml")
@Component
public class Order {
	@Value("${name}")
	private  String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
