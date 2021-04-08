package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean6;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
public class JavaConfig {
	@Bean
	public TestBean1 test() {
		TestBean1 t1 = new TestBean1();
		return t1;

		// 200, 55.55, 주소값 2개로 변경

	}

	@Bean
	public TestBean6 java1() {
		TestBean6 t = new TestBean6(null, null);
		t.setA(200);
		t.setB(55.55);
		t.getC();
		t.getD();
		return t;
	}
}
