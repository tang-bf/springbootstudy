package test;

import com.tbh.demo.TBHSpringBootDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
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
public class TestDemo {
	@Test
	public  void test(){
		System.out.println("》》》》》》》》》》》》》》");
	}
}
