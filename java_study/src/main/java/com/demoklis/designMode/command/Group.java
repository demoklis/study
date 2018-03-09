package com.demoklis.designMode.command;

public abstract class Group {

	public abstract void find();
	
	public abstract void add();
	
	public abstract void delete();
	
	public abstract void change();
	//给出所有的变更计划
	public abstract void plan();
}
