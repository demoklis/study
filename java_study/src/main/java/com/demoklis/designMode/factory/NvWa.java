package com.demoklis.designMode.factory;
//女蜗大神
public class NvWa {
	public static void main(String[] args) {
		System.out.println("第一批-----白人");
		Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
		whiteHuman.cry();
		whiteHuman.laugh();
		whiteHuman.talk();
		
		System.out.println("第二批-----黑人");
		Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
		blackHuman.cry();
		blackHuman.laugh();
		blackHuman.talk();
		
		System.out.println("第三批-----黄色人");
		Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
		yellowHuman.cry();
		yellowHuman.laugh();
		yellowHuman.talk();
		
		//随机创造
		for(int i=0;i<10000000000l;i++) {
			System.out.println("随机产生人类");
			Human human = HumanFactory.createHuman();
			human.cry();
			human.laugh();
			human.talk();
		}
	}
}
