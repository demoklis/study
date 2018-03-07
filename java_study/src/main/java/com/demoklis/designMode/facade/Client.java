package com.demoklis.designMode.facade;

public class Client {
	
	//这个调用不够高内聚，因为，1你要知道这四个步骤，2还要知道他们的顺序，一旦出错就没法寄信
	public static void main(String[] args) {
		LetterProcess letterProcess = new LetterProcessImpl();
		letterProcess.writeContext("开始写信");
		letterProcess.fillEnvelope("开始写信封");
		letterProcess.letterIntoEnvelope();
		letterProcess.sendLetter();
		//------------------
		System.out.println("-----------------");
		ModenPostOffice hellRoadPostOffice = new ModenPostOffice();
		String address="地址";
		String context="内容";
		hellRoadPostOffice.sendLetter(context, address);
	}
}
