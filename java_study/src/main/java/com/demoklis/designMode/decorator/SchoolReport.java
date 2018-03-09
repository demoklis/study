package com.demoklis.designMode.decorator;
/**
 * 成绩单抽象类
 * @author demoklis
 *
 */
public abstract class SchoolReport {
	//成绩单主要展示成绩
	public abstract void report();
	//成绩单给家长签字
	public abstract void sign(String name);
}
