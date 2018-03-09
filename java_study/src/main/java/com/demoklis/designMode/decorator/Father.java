package com.demoklis.designMode.decorator;
/**
 * 老爸看成绩单
 * @author demoklis
 *
 */
public class Father {
	public static void main(String[] args) {
		SchoolReport sr = new FouthGradeSchoolReport();
		//看成绩单
		sr.report();
		//签名？休想
		//按照以上方式是不可能得到签名的，所以需要封装一下
		SchoolReport sr1=new SugarFouthGradeSchoolReport();
		sr1.report();
		sr1.sign("老三");
		//---------------------
		System.out.println("############");
		SchoolReport sr2;
		sr2=new FouthGradeSchoolReport();
		sr2=new HightScoreDecorator(sr2);
		sr2=new SortDecorator(sr2);
		sr2.report();
		sr.sign("老三");
	}
}
