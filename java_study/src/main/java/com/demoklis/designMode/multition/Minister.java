package com.demoklis.designMode.multition;

//大臣
public class Minister {

	public static void main(String[] args) {
		int ministerNum=10;//10个大臣
		for(int i=0;i<ministerNum;i++) {
			Emperor e=Emperor.getInstance();
			System.out.println("第"+(i+1)+"个大臣参拜的是：");
			e.emperorInfo();
		}
	}
}
