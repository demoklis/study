package com.demoklis.java_study.annotation.inherited;

@BTable(name="bbb")
public class Sub extends Super {
	private int subx;
	public int suby;

	private Sub() {
	}

	public Sub(int i) {
	}

	private int subX() {
		return 0;
	}

	public int subY() {
		return 0;
	}
}
