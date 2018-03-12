package com.demoklis.designMode.iterator;

import java.util.ArrayList;

public class Boss {

	public static void main(String[] args) {
//		ArrayList<Iproject> projectList= new ArrayList<Iproject>();
//		projectList.add(new Project("星球大战项目", 10, 10000));
//		projectList.add(new Project("扭转时空项目", 10, 10000000));
//		projectList.add(new Project("超人改造项目", 10, 1000000000));
//		for(int i=0;i<104;i++) {
//			projectList.add(new Project("第"+i+"个项目",i*5,i*1000000));
//		}
//		
//		for(Iproject project:projectList) {
//			System.out.println(project.getProjectInfo());
//		}
		Iproject project= new Project();
		project.add("星球大战项目", 10, 10000);
		project.add("扭转时空项目", 10, 10000000);
		project.add("超人改造项目", 10, 1000000000);
		for(int i=0;i<104;i++) {
			project.add("第"+i+"个项目",i*5,i*1000000);
		}
		
		IProjectIterator projectIterator=project.iterator();
		
		while(projectIterator.hasNext()) {
			Iproject p=(Iproject) projectIterator.next();
			System.out.println(p.getProjectInfo());
		}
	}
}
