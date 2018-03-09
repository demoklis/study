package com.demoklis.designMode.builder;

public class BMWModel extends CarModel{


	@Override
	protected void start() {
		System.out.println("宝马跑起来");
	}

	@Override
	protected void stop() {
		System.out.println("宝马停止");

	}

	@Override
	protected void alarm() {
		System.out.println("宝马喇叭");

	}

	@Override
	protected void engineBoom() {
		System.out.println("宝马引擎");

	}

}
