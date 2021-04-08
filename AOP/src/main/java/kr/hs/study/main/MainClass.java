package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx1.getBean("t1", TestBean1.class);
		t1.method3();
		System.out.println(t1);

		ctx1.close();

	}// main

}
