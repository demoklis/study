package com.demoklis.designMode.proxy;

/**
 * 王婆太老，但是有智慧，所以他是潘金莲一类女人的代理
 * @author demoklis
 *
 */
public class WangPo implements KindWomen {
	
	private KindWomen kindWomen;
	/**
	 * 默认潘金莲
	 */
	public WangPo() {
		kindWomen=new PanJinLian();
	}

	public WangPo(KindWomen jiashi) {
		kindWomen=jiashi;
	}

	@Override
	public void makeEyesWithMan() {
		this.kindWomen.makeEyesWithMan();
	}

	@Override
	public void happyWithMan() {
		this.kindWomen.happyWithMan();
	}

}
