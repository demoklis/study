package com.demoklis.designMode.decorator;

public class SortDecorator extends Decorator {

	public SortDecorator(SchoolReport schoolReport) {
		super(schoolReport);
	}

	private void reportSort() {
		System.out.println("我是排名第38名...");
	}
	
	@Override
	public void report() {
		super.report();
		this.reportSort();
	}
}
