package com.demoklis.designMode.adapter;

public class App {
public static void main(String[] args) {
	IUserInfo youngGirl = new UserInfo();
	for(int i=0;i<101;i++) {
		youngGirl.getMobileNumber();
	}
	//----------------------
	IUserInfo youngGirl1 = new OuterUserInfo();
	for(int i=0;i<101;i++) {
		youngGirl1.getMobileNumber();
	}
}
}
