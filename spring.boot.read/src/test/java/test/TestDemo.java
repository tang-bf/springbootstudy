package test;

import com.tbh.demo.TBHSpringBootDemo;
import com.tbh.demo.tbh.Order;
import com.tbh.demo.tbh.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ProjectName: spring-boot-build
 * @Package: test
 * @ClassName: TestDemo
 * @Description:
 * @Author: tbf
 * @CreateDate: 2020-08-10 21:28
 * @UpdateUser: Administrator
 * @UpdateDate: 2020-08-10 21:28
 * @UpdateRemark:
 * @Version: 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes=com.tbh.demo.TBHSpringBootDemo.class)
//@PropertySource("classpath:order.yml")
public class TestDemo {
	@Autowired
	Student student;
	@Autowired
	Order order;
	@Test
	public  void test(){
		System.out.println("》》》》》》》》》》》》》》");
		System.out.println(student);
		System.out.println(order.getName());

	}
}
