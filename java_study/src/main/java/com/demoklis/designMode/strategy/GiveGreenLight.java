package com.demoklis.designMode.strategy;
/**
 * 求吴国太开绿灯
 * @author demoklis
 *
 */
public class GiveGreenLight implements IStrategy {

	@Override
	public void operate() {
		System.out.println("求吴国太开绿灯，方行！");
	}

}
