package com.demoklis.designMode.bridge;

public class HoseCorp extends Corp {
	
	public HoseCorp(Product product) {
		super(product);
	}


	@Override
	public void makeMoney() {
		super.makeMoney();
		System.out.println("房地产公司赚大钱");
	}
}
