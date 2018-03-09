package com.demoklis.designMode.bridge;

public class IPodCorp extends Corp {

	public IPodCorp(Product product) {
		super(product);
	}
	
	@Override
	public void makeMoney() {
		super.makeMoney();
		System.out.println("赚钱");
	}
}
