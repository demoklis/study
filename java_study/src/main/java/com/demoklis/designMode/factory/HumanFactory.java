package com.demoklis.designMode.factory;

import java.util.List;
import java.util.Random;

public class HumanFactory {
	//定义烤箱、泥巴塞进去、人就出来
	public static Human createHuman(Class c) {
		Human human =null;
		try {
			human=(Human) Class.forName(c.getName()).newInstance();
		}catch(InstantiationException e) {
			System.out.println("必须指定人类颜色");
		}catch(IllegalAccessException e) {
			System.out.println("人类定义错误");
		}catch(ClassNotFoundException e) {
			System.out.println("指定的人类找不到");
		}
		return human;
	}
	
	//随机生产人类
	public static Human createHuman() {
		Human human =null;
		List<Class> concreateHumanList = ClassUtils.getAllClassByInterface(Human.class);
		Random random =new Random();
		int rand =random.nextInt(concreateHumanList.size());
		human = createHuman(concreateHumanList.get(rand));
		return human;
	}
}
