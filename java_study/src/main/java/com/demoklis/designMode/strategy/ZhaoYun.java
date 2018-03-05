package com.demoklis.designMode.strategy;
/**
 * 策略模式的优点，管理算法族，可以一直扩展，同时避免多重条件转移语句，不用写if&else
 * 缺点：客户端需要全不知道有哪些策略然后才能正确使用，而且一旦多起来，维护不易
 * @author demoklis
 *
 */
public class ZhaoYun {

	//赵云出场，根据诸葛亮给的交代，依次拆开妙计
	public static void main(String[] args) {
		Context context;
		//1
		System.out.println("刚到吴国拆第一个-------------");
		context =new Context(new BackDoor());
		context.operate();
		System.out.println("\\n\\n\\n\\n\\n\\n");
		//2
		System.out.println("刘备乐不思蜀拆第二个-------------");
		context =new Context(new GiveGreenLight());
		context.operate();
		System.out.println("\\n\\n\\n\\n\\n\\n");
		//3
		System.out.println("孙权的小兵追了，拆第三个-------------");
		context =new Context(new BlockEnemy());
		context.operate();
		System.out.println("\\n\\n\\n\\n\\n\\n");
	}
}
