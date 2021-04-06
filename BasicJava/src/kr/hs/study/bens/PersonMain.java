package kr.hs.study.bens;

public class PersonMain {
	public static void main(String[] args) {
		Person p = new Person("lee", 25);
		
//		p.setName("kim");
//		p.setAge(30);
//		System.out.println(p.getName());
//		System.out.println(p.getAge());
//		System.out.println("===========");
		System.out.println("이름 : " + p.getName() + "나이 : " + p.getAge());
		
	}//main

}
