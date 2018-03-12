package com.demoklis.designMode.composite;

import java.util.ArrayList;

//根节点
public interface IRoot {
	//得到总经理信息
	public String getInfo();
	//增加小兵
	public void add(IBranch branch);
	//增加树叶节点
	public void add(ILeaf leaf);
	//既然增加，那还要遍历
	public ArrayList getSubordinateInfo();
}
