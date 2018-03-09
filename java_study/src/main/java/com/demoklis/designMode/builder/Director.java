package com.demoklis.designMode.builder;

import java.util.ArrayList;

public class Director {
	
	private ArrayList<String> sequence = new ArrayList();
	
	private BenzBuilder benzBuilder=new BenzBuilder();
	
	private BMWBuilder bmwBuilder = new BMWBuilder();
	/**
	 * A 类型的奔驰
	 * @return
	 */
	public BenzModel getABenzModel() {
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(this.sequence);
		return (BenzModel) this.benzBuilder.getCarModel();
	}
	
	/**
	 * D 类型
	 * @return
	 */
	public BMWModel getDBenzModel() {
		this.sequence.clear();
		this.sequence.add("start");
		this.bmwBuilder.setSequence(this.sequence);
		return (BMWModel) this.bmwBuilder.getCarModel();
	}
	
	/**
	 * C 类型
	 * @return
	 */
	public BMWModel getCBenzModel() {
		this.sequence.clear();
		this.sequence.add("alarm");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.bmwBuilder.setSequence(this.sequence);
		return (BMWModel) this.bmwBuilder.getCarModel();
	}
	
	/**
	 * B 类型的奔驰
	 * @return
	 */
	public BenzModel getBBenzModel() {
		this.sequence.clear();
		this.sequence.add("engineBoom");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(this.sequence);
		return (BenzModel) this.benzBuilder.getCarModel();
	}
}
