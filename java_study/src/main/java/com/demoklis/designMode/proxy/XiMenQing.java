package com.demoklis.designMode.proxy;

public class XiMenQing {

	public static void main(String[] args) {
//		WangPo wangpo=new WangPo();
//		wangpo.makeEyesWithMan();
//		wangpo.happyWithMan();
		JiaShi jiashi=new JiaShi();
		WangPo wangpo=new WangPo(jiashi);
		wangpo.makeEyesWithMan();
		wangpo.happyWithMan();
	}
}
