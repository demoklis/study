package com.demoklis.designMode.adapter;

import java.util.Map;

//适配器
public class OuterUserInfo extends OuterUser implements IUserInfo{

	private Map baseInfo=super.getUserBaseInfo();
	private Map homeInfo=super.getUserHomeInfo();
	private Map officeInfo=super.getUserOfficeInfo();
	
	@Override
	public String getUserName() {
		String userName=(String) this.baseInfo.get("useName");
		return userName;
	}

	@Override
	public String getHomeAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMobileNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getOfficeTelNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getJobPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
