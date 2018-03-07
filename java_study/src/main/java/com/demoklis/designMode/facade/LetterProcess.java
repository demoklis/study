package com.demoklis.designMode.facade;
/**
 * 定义一个写信的过程
 */
public interface LetterProcess {
	
	/**写信的内容*/
	public void writeContext(String context);
	/**写信封*/
	public void fillEnvelope(String address);
	/**把信放到信封里*/
	public void letterIntoEnvelope();
	/**邮递*/
	public void sendLetter();
}
