package com.demoklis.designMode.composite.modifyVersion;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		Branch ceo=compositeCorpTree();
		System.out.println(ceo.getInfo());
		System.out.println(getTreeInfo(ceo));
	}
	
	private static String getTreeInfo(Branch ceo) {
		ArrayList<ICorp> subordinateList=ceo.getSubordinate();
		String info ="";
		for(ICorp s:subordinateList) {
			if(s instanceof Leaf) {
				info=info+s.getInfo()+"\n";
			}else {
				info= info+s.getInfo()+"\n"+getTreeInfo((Branch) s);
			}
		}
		return info;
	}

	public static Branch compositeCorpTree() {

		Branch root=new Branch("王", "总经理", 100000);
		Branch branch=new Branch("刘", "研发部经理", 10000);
		Branch branch1=new Branch("马", "销售部经理", 20000);
		Branch branch2=new Branch("赵", "财务部经理", 30000);

		Branch branch3=new Branch("杨", "开发一组", 5000);
		Branch branch4=new Branch("吴", "开发二组", 6000);
		
		ICorp a=new Leaf("a", "开发人员", 2000);
		ICorp b=new Leaf("b", "开发人员", 2000);
		ICorp c=new Leaf("c", "开发人员", 2000);
		ICorp d=new Leaf("d", "开发人员", 2000);
		ICorp e=new Leaf("e", "开发人员", 2000);
		ICorp f=new Leaf("f", "开发人员", 2000);
		ICorp g=new Leaf("g", "开发人员", 2000);
		ICorp h=new Leaf("h", "开发人员", 2000);
		ICorp i=new Leaf("i", "开发人员", 2000);
		ICorp j=new Leaf("j", "开发人员", 2000);
		ICorp k=new Leaf("j", "ceo秘书", 2000);

		ICorp zhenlaoliu=new Leaf("郑", "副总", 20000);
		root.addSubordinate(branch);
		root.addSubordinate(branch1);
		root.addSubordinate(branch2);
		root.addSubordinate(k);
		
		branch.addSubordinate(branch3);
		branch.addSubordinate(branch4);
		branch.addSubordinate(zhenlaoliu);
		
		branch3.addSubordinate(a);
		branch3.addSubordinate(b);
		branch3.addSubordinate(c);
		branch3.addSubordinate(d);
		branch3.addSubordinate(e);
		branch3.addSubordinate(f);

		branch1.addSubordinate(h);
		branch1.addSubordinate(i);

		branch2.addSubordinate(j);
		
		System.out.println(root.getInfo());
		return root;
	}
}
