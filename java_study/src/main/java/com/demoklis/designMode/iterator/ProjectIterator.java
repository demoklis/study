package com.demoklis.designMode.iterator;

import java.util.ArrayList;

public class ProjectIterator implements IProjectIterator {
	
	private ArrayList<Iproject> projectList=new ArrayList<Iproject>();

	private int currentItem=0;
	
	public ProjectIterator(ArrayList<Iproject> projectList) {
		this.projectList=projectList;
	}
	
	@Override
	public boolean hasNext() {
		boolean b=true;
		if(this.currentItem>=projectList.size()||this.projectList.get(this.currentItem)==null) {
			b=false;
		}
		return b;
	}

	@Override
	public Iproject next() {
		return this.projectList.get(this.currentItem++);
	}

}
