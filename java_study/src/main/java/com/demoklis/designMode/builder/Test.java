package com.demoklis.designMode.builder;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		BenzModel benz =new BenzModel();
		ArrayList<String> sequence=new ArrayList<String>();
		sequence.add("engineBoom");
		sequence.add("start");
		sequence.add("stop");
		benz.setSequence(sequence);
		benz.run();
		//-----------------------
		BenzBuilder benzBuilder=new BenzBuilder();
		benzBuilder.setSequence(sequence);
		BenzModel benz1=(BenzModel) benzBuilder.getCarModel();
		benz1.run();
		
		//-----------------------
		Director director = new Director();
		for(int i=0;i<10000;i++) {
			director.getABenzModel().run();
		}
		for(int i=0;i<10000;i++) {
			director.getBBenzModel().run();
		}
		for(int i=0;i<10000;i++) {
			director.getCBenzModel().run();
		}
	}
}
