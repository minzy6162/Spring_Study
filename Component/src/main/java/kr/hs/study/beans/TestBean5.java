package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class TestBean5 {
	private int data1;
	private String data2;
	
	@Autowired
	private DataBean4 data4;
	
	@Autowired
	private DataBean5 data5;
	//DataBean5클래스의 빈(객체)가 있으면 그 주소값을 data5에 대입시켜라

	// 1.멤버변수에 자동주입 data4, data5
	public int getData1() {
		return data1;
	}

	public void setData1(int data1) {
		this.data1 = data1;
	}

	public String getData2() {
		return data2;
	}

	public void setData2(String data2) {
		this.data2 = data2;
	}

	public DataBean4 getData4() {
		return data4;
	}

	public void setData4(DataBean4 data4) {
		this.data4 = data4;
	}

	public DataBean5 getData5() {
		return data5;
	}

	public void setData5(DataBean5 data5) {
		this.data5 = data5;
	}

	public TestBean5(DataBean4 data4, DataBean5 data5) {
		this.data4 = data4;
		this.data5 = data5;
	}

}
