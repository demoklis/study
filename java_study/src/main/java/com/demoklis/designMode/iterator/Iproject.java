package com.demoklis.designMode.iterator;

public interface Iproject {
	public String getProjectInfo();
	//增加项目
	public void add(String name,int num,int cost);
	//获得一个可以被遍历的对象
	public IProjectIterator iterator();
}
