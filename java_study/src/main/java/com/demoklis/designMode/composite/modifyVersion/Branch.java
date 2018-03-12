package com.demoklis.designMode.composite.modifyVersion;

import java.util.ArrayList;

public class Branch implements IBranch,ICorp {
	private String name="";
	private String position="";
	private int salary=0;
	
	private ArrayList<ICorp> subordinateList=new ArrayList<ICorp>();
	
	public Branch(String name,String position,int salary) {
		this.name=name;
		this.position=position;
		this.salary=salary;
	}
	@Override
	public void addSubordinate(ICorp corp) {
		this.subordinateList.add(corp);
	}

	@Override
	public ArrayList<ICorp> getSubordinate() {
		return this.subordinateList;
	}
	@Override
	public String getInfo() {
		String info="";
		info="姓名："+this.name;
		info=info+"\t职位："+this.position;
		info=info+"\t薪水："+this.salary;
		return info;
	}

}
