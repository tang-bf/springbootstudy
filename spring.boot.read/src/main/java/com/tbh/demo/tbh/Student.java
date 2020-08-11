package com.tbh.demo.tbh;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring-boot-build
 * @Package: com.tbh.demo.tbh
 * @ClassName: Student
 * @Description:
 * @Author: tbf
 * @CreateDate: 2020-08-10 21:48
 * @UpdateUser: Administrator
 * @UpdateDate: 2020-08-10 21:48
 * @UpdateRemark:
 * @Version: 1.0
 */
@Component
@ConfigurationProperties(prefix = "student")
public class Student {
	private  String name;
	private String sex;
	private  Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", sex='" + sex + '\'' +
				", age=" + age +
				'}';
	}
}
