package com.demoklis.designMode.builder;

import java.util.ArrayList;

public abstract class CarBuilder {

	//建造一个模型，给一个顺序就是组装顺序
	public abstract void setSequence(ArrayList<String> sequence);
	//设置完毕就可以拿到这个车
	public abstract CarModel getCarModel();
}
