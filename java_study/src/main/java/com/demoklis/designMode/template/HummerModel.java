package com.demoklis.designMode.template;

public abstract class HummerModel {
	
	protected abstract void start();
	
	protected abstract void stop();
	
	protected abstract void alarm();
	
	protected abstract void engineBoome();
	
	public final void run() {
		start();
		engineBoome();
		alarm();
		stop();
	};
}
