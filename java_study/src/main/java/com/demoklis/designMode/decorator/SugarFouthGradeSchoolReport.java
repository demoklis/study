package com.demoklis.designMode.decorator;

public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {

	private void reportHightScore() {
		System.out.println("这次考试语文最高是75，数学是78，自然是80");
	}
	
	private void reportSort() {
		System.out.println("我是排名第38名");
	}
	@Override
	public void report() {
		this.reportHightScore();
		super.report();
		this.reportSort();
	}
}
