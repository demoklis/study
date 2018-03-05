package com.demoklis.designMode.strategy;
/**
 * 计谋有了，还要有锦囊
 * @author demoklis
 *
 */
public class Context {
	private IStrategy strategy;
	public Context(IStrategy strategy) {
		this.strategy=strategy;
	}
	
	//使用计谋，看我出招
	public void operate() {
		this.strategy.operate();
	}
}
