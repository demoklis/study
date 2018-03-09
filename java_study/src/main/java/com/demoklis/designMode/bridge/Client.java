package com.demoklis.designMode.bridge;

public class Client {

	public static void main(String[] args) {
		System.out.println("房地产公司是这样运营的");
		Hose hose =new Hose();
		HoseCorp hoseCorp=new HoseCorp(hose);
		hoseCorp.makeMoney();
		System.out.println("山寨公司是这样运营的");
		ShanZhaiCorp clothCorp=new ShanZhaiCorp(new IPod());
		clothCorp.makeMoney();
		
	}
}
