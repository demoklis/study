package com.demoklis.designMode.facade;
/**
 * 具体实现
 * @author demoklis
 *
 */
public class LetterProcessImpl implements LetterProcess {

	@Override
	public void writeContext(String context) {
		System.out.println("填写信的内容");
	}

	@Override
	public void fillEnvelope(String address) {
		System.out.println("收件人地址和姓名");

	}

	@Override
	public void letterIntoEnvelope() {
		System.out.println("把信放到信封中");

	}

	@Override
	public void sendLetter() {
		System.out.println("邮递信件");

	}

}
