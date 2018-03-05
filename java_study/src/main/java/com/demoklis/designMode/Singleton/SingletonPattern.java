package com.demoklis.designMode.Singleton;
//通用单例模式
public class SingletonPattern {
	private static SingletonPattern singletonPattern= new SingletonPattern();
	
	private SingletonPattern() {
		
	}
	
	public static SingletonPattern getInstance() {
		return singletonPattern;
	}
	
	public void test() {
		System.out.println("test");
	}
}
