package com.tbh.demo.devtools;

/**
 * @ProjectName: spring-boot-build
 * @Package: com.tbh.demo.devtools
 * @ClassName: ClassLoaderTest
 * @Description:
 * @Author: tbf
 * @CreateDate: 2020-08-17 22:34
 * @UpdateUser: Administrator
 * @UpdateDate: 2020-08-17 22:34
 * @UpdateRemark:
 * @Version: 1.0
 */

public class ClassLoaderTest {
	public static void main(String[] args) {
		//系统类加载器
		ClassLoader sysClassLoader =  ClassLoader.getSystemClassLoader();
		System.out.println(sysClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2
		//获取扩展类加载
		ClassLoader extClassLoader  =  sysClassLoader.getParent();
		System.out.println(extClassLoader);//sun.misc.Launcher$ExtClassLoader@119d7047
		//获取上层
		ClassLoader bootClassLoader  =  extClassLoader.getParent();
		System.out.println(bootClassLoader);//null
		ClassLoader userClassLoader  =  ClassLoaderTest.class.getClassLoader();
		System.out.println(userClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2
		System.out.println(String.class.getClassLoader());//null
		//java 核心类库都是引导类加载器加载的

	}
}
