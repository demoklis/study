package com.demoklis.designMode.strategy;

/**
 * 开后门，找乔老帮忙，使孙权不能杀刘备
 * @author demoklis
 *
 */
public class BackDoor implements IStrategy {

	@Override
	public void operate() {
		System.out.println("找乔老帮忙，让吴国太给孙权施加压力");

	}

}
