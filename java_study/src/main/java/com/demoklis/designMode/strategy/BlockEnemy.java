package com.demoklis.designMode.strategy;
/**
 * 孙夫人断后，挡住追兵
 * @author demoklis
 *
 */
public class BlockEnemy implements IStrategy {

	@Override
	public void operate() {
		System.out.println("孙夫人断后，挡住追兵");
	}

}
