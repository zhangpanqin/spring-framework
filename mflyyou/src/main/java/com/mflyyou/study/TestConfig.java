package com.mflyyou.study;

import com.mflyyou.study.service.TestService;
import org.springframework.context.annotation.Bean;

/**
 * @author 张攀钦
 * @date 2021-01-30-00:05
 */

public class TestConfig {
	@Bean
	public TestService testService() {
		return new TestService();
	}
}
