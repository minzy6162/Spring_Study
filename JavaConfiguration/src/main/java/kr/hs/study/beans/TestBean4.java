package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class TestBean4 {
	private int data1;
	
	@Autowired // 
	private DataBean4 data2;
	
	public TestBean4() {
		System.out.println("TestBean4의 기본생성자");
	}
	
	public TestBean4(int data1, DataBean4 data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public DataBean4 getData2() {
		return data2;
	}
	public void setData2(DataBean4 data2) {
		this.data2 = data2;
	}
	
	
	
	
	
}
