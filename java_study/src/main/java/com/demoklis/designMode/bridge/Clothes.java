package com.demoklis.designMode.bridge;

public class Clothes extends Product {

	@Override
	public void beProducted() {
		System.out.println("生产的衣服是这样的");
	}

	@Override
	public void beSelled() {
		System.out.println("生产的衣服卖出去了");
	}

}
