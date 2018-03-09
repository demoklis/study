package com.demoklis.designMode.decorator;

public class HightScoreDecorator extends Decorator {

	public HightScoreDecorator(SchoolReport schoolReport) {
		super(schoolReport);
	}

	//汇报最高成绩
	private void reportHightScore() {
		System.out.println("这次考试语文最高75，数学78，自然是80");
	}
	
	public void report() {
		this.reportHightScore();
		super.report();
	}
}
