package kr.hs.study.main;

import kr.hs.study.beans.HelloWorld;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKo;

public class Hello {

	public static void main(String[] args) {
		HelloWorld hello = new HelloWorldEn(); // �θ� �ڽİ�ü ��������
		hello.sayHello();
		HelloWorld hello2 = new HelloWorldKo();
		hello2.sayHello();

	}

}
