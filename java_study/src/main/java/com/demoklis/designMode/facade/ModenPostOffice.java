package com.demoklis.designMode.facade;

public class ModenPostOffice {
	private LetterProcess letterProcess=new LetterProcessImpl();
	//写信 、封装、投递一体化
	public void sendLetter(String context,String address) {
		letterProcess.writeContext(context);
		letterProcess.fillEnvelope(address);
		letterProcess.letterIntoEnvelope();
		letterProcess.sendLetter();
	}
}
