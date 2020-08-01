package com.tbh.demo.tbh;

//import org.springframework.boot.SpringApplication;

/**
 * @ProjectName: spring-boot-build
 * @Package: com.tbh
 * @ClassName: MySpringBootDemo
 * @Description:
 * @Author: tbf
 * @CreateDate: 2020-08-01 11:40
 * @UpdateUser: Administrator
 * @UpdateDate: 2020-08-01 11:40
 * @UpdateRemark:
 * @Version: 1.0
 */

/**
 * 下载源码  导入idea
 * mvn clean install -DskipTests -Pfast
 * 由于Downloading https://services.gradle.org/distributions/gradle-4.10.2-all.zip 失败
 * 手动下载到本地磁盘  运行脚本配置环境
 * 再次执行上述命令
 * 会有[ERROR] Failed to
 * spring-boot-gradle-plugin: Command execution failed.: Process exited with an error: 1 (Exit value: 1) -> [Help 1]
 * 根据帮助执行mvn clean -rf :spring-boot-gradle-plugin
 * 最终都会success
 * 至此构建完成，可以自建module调试跟踪springboot源码
 */
public class MySpringBootDemo {
	public static void main(String[] args) {
		//SpringApplication.run(MySpringBootDemo.class,args);
	}
}
