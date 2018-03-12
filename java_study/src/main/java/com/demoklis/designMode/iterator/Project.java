package com.demoklis.designMode.iterator;

import java.util.ArrayList;

public class Project implements Iproject {
	
	private ArrayList<Iproject> projectList=new ArrayList<Iproject>();
	
	//项目名称
	private String name="";
	//项目成员数量
	private int num=0;
	//项目费用
	private int cost=0;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}
	
	public Project(String name,int num,int cost) {
		this.name=name;
		this.num=num;
		this.cost=cost;
	}
	
	@Override
	public String getProjectInfo() {
		String info ="";
		info = info+"项目名称是："+this.name;
		info = info+"\t项目人数："+this.num;
		info = info+"\t项目费用："+this.cost;
		return info;
	}

	@Override
	public void add(String name, int num, int cost) {
		this.projectList.add(new Project(name, num, cost));
	}

	@Override
	public IProjectIterator iterator() {
		return new ProjectIterator(this.projectList);
	}

}
