package com.demoklis.designMode.bridge;

import com.demoklis.designMode.builder.CarModel;

public class IPod extends Product {

	@Override
	public void beProducted() {
		System.out.println("生产的ipod是这样的");
	}

	@Override
	public void beSelled() {
		System.out.println("生产的ipod卖出去了");
	}
}
