package com.demoklis.designMode.builder;

public class BenzModel extends CarModel {

	@Override
	protected void start() {
		System.out.println("奔驰跑起来");
	}

	@Override
	protected void stop() {
		System.out.println("奔驰停止");

	}

	@Override
	protected void alarm() {
		System.out.println("奔驰喇叭");

	}

	@Override
	protected void engineBoom() {
		System.out.println("奔驰引擎");

	}

}
