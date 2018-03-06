package com.demoklis.designMode.multition;

import java.util.ArrayList;
import java.util.Random;

public class Emperor {
	private Emperor(String info) {
		emperorInfoList.add(info);
	}
	private static int maxNumOfEmperor = 2;//最多2个皇帝
	//皇帝叫什么名字
	private static ArrayList emperorInfoList=new ArrayList(maxNumOfEmperor);
	//装皇帝的列表
	private static ArrayList emperorList=new ArrayList(maxNumOfEmperor);
	//正在被人尊称的是哪个皇帝
	private static int countNumOfEmperor=0;
	//先生产出2个皇帝
	static {
		for(int i=0;i<maxNumOfEmperor;i++) {
			emperorList.add(new Emperor("皇帝"+(i+1)));
		}
	}
	
	public static Emperor getInstance() {
		Random random=new Random();
		countNumOfEmperor = random.nextInt(maxNumOfEmperor);//随机拉出一个皇帝
		return (Emperor) emperorList.get(countNumOfEmperor);
	}
	
	//皇帝叫什么名字啊
	public static void emperorInfo() {
		System.out.println(emperorInfoList.get(countNumOfEmperor));
	}
}
