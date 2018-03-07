package com.demoklis.designMode.adapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {

	@Override
	public Map getUserBaseInfo() {
		HashMap baseInfo= new HashMap();
		baseInfo.put("userName", "这个员工叫混世魔王");
		baseInfo.put("mobileNumber","这个员工电话是。。。。。。");
		return baseInfo;
	}

	@Override
	public Map getUserOfficeInfo() {
		HashMap baseInfo= new HashMap();
		baseInfo.put("homeTelNumbner", "这个员工家庭电话");
		baseInfo.put("homeAddress","这个员工家庭地址");
		return baseInfo;
	}

	@Override
	public Map getUserHomeInfo() {
		HashMap baseInfo= new HashMap();
		baseInfo.put("jobPosition", "这个员工职位是boss");
		baseInfo.put("officeTelNumber","这个员工办公电话是");
		return baseInfo;
	}

}
