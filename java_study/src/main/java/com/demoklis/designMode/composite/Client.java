package com.demoklis.designMode.composite;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		IRoot root=new Root("王", "总经理", 100000);
		IBranch branch=new Branch("刘", "研发部经理", 10000);
		IBranch branch1=new Branch("马", "销售部经理", 20000);
		IBranch branch2=new Branch("赵", "财务部经理", 30000);

		IBranch branch3=new Branch("杨", "开发一组", 5000);
		IBranch branch4=new Branch("吴", "开发二组", 6000);
		
		ILeaf a=new Leaf("a", "开发人员", 2000);
		ILeaf b=new Leaf("b", "开发人员", 2000);
		ILeaf c=new Leaf("c", "开发人员", 2000);
		ILeaf d=new Leaf("d", "开发人员", 2000);
		ILeaf e=new Leaf("e", "开发人员", 2000);
		ILeaf f=new Leaf("f", "开发人员", 2000);
		ILeaf g=new Leaf("g", "开发人员", 2000);
		ILeaf h=new Leaf("h", "开发人员", 2000);
		ILeaf i=new Leaf("i", "开发人员", 2000);
		ILeaf j=new Leaf("j", "开发人员", 2000);
		ILeaf k=new Leaf("j", "ceo秘书", 2000);

		ILeaf zhenlaoliu=new Leaf("郑", "副总", 20000);
		root.add(branch);
		root.add(branch1);
		root.add(branch2);
		root.add(k);
		
		branch.add(branch3);
		branch.add(branch4);
		branch.add(zhenlaoliu);
		
		branch3.add(a);
		branch3.add(b);
		branch3.add(c);
		branch3.add(d);
		branch3.add(e);
		branch3.add(f);

		branch1.add(h);
		branch1.add(i);

		branch2.add(j);
		
		System.out.println(root.getInfo());
		getAllSubordinateInfo(root.getSubordinateInfo());
	}

	private static void getAllSubordinateInfo(ArrayList subordinateInfo) {
		int length= subordinateInfo.size();
		for(int m=0;m<length;m++) {
			Object s=subordinateInfo.get(m);
			if(s instanceof Leaf) {
				ILeaf employee=(ILeaf) s;
				System.out.println(employee.getInfo());
			}else {
				IBranch branch=(IBranch) s;
				System.out.println(branch.getInfo());
				//递归
				getAllSubordinateInfo(branch.getSubordinateInfo());
			}
		}
	}
}
