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
	/**
	 * protected Class<?> loadClass(String name, boolean resolve)
	 *         throws ClassNotFoundException
	 *     {
	 *         synchronized (getClassLoadingLock(name)) {
	 *             // First, check if the class has already been loaded
	 *             从缓存里面找到是否已经加载
	 *             Class<?> c = findLoadedClass(name);
	 *             if (c == null) {
	 *                 long t0 = System.nanoTime();
	 *                 try {
	 *                     if (parent != null) {
	 *                     父加载器加载  递归调用
	 *                         c = parent.loadClass(name, false);
	 *                     } else {
	 *                         c = findBootstrapClassOrNull(name);
	 *                     }
	 *                 } catch (ClassNotFoundException e) {
	 *                     // ClassNotFoundException thrown if class not found
	 *                     // from the non-null parent class loader
	 *                 }
	 *
	 *                 if (c == null) {
	 *                     // If still not found, then invoke findClass in order
	 *                     // to find the class.
	 *                     long t1 = System.nanoTime();
	 *                     自定义类加载器加载
	 *                     c = findClass(name);
	 *
	 *                     // this is the defining class loader; record the stats
	 *                     sun.misc.PerfCounter.getParentDelegationTime().addTime(t1 - t0);
	 *                     sun.misc.PerfCounter.getFindClassTime().addElapsedTimeFrom(t1);
	 *                     sun.misc.PerfCounter.getFindClasses().increment();
	 *                 }
	 *             }
	 *             if (resolve) {
	 *                 resolveClass(c);
	 *             }
	 *             return c;
	 *         }
	 *     }
	 */
}
