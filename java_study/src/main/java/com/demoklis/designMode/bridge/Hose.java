package com.demoklis.designMode.bridge;

public class Hose extends Product{

	@Override
	public void beProducted() {
		System.out.println("生产的房子是这样的");
	}

	@Override
	public void beSelled() {
		System.out.println("生产的房子卖了");
	}

}
