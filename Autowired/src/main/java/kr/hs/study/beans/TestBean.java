package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean {
	private DataBean data1;
	private DataBean data2;

	public TestBean() {

	}

	public TestBean(DataBean data1, DataBean data2) {
		super();
		this.data1 = data1;
		this.data2 = data2;
	}

	public DataBean getData1() {
		return data1;
	}

	public void setData1(DataBean data1) {
		this.data1 = data1;
	}

	public DataBean getData2() {
		return data2;
	}

	public void setData2(DataBean data2) {
		this.data2 = data2;
	}

}
