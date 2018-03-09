package com.demoklis.designMode.command;

public class Client {

	public static void main(String[] args) {
		System.out.println("----------客户增加一个需求");
		Group rg=new RequirementGroup();
		rg.find();
		rg.delete();
		rg.plan();
		//--------------以上方法如果客户不停的改需求，将要改代码很麻烦
		//以下的方法,想想如果客户需要删除一个页面，我们改动有多大？只需要将AddRequirementCommand替换为DeletePageCommand就好，
		//不会像上面一样重新new一个对象还一个个单独执行
		Invoker xiaoSan=new Invoker();
		System.out.println("客户要求增加一项需求--------");
		Command command=new AddRequirementCommand();
		xiaoSan.setCommand(command);
		xiaoSan.action();
	}
}
