package com.mflyyou.study;


import com.mflyyou.study.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 张攀钦
 * @date 2021-01-29-23:29
 */
public class TestDemo {
	public static void main(String[] args) {
		final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(TestConfig.class);
		applicationContext.refresh();
		final TestService bean = applicationContext.getBean(TestService.class);
		System.out.println(bean.test());
	}
}
