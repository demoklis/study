package com.demoklis.designMode.factory;

public class WhiteHuman implements Human {

	@Override
	public void laugh() {
		System.out.println("白色人类会笑");
	}

	@Override
	public void cry() {
		System.out.println("白色人类会哭");
	}

	@Override
	public void talk() {
		System.out.println("白色人类会说话");
	}

}
