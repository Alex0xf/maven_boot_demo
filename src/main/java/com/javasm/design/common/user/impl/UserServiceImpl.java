package com.javasm.design.common.user.impl;

import com.javasm.design.common.user.IUserService;

//真实主题类
public class UserServiceImpl implements IUserService{

	@Override
	public void save() {
		//真实工作的方法
		System.out.println("UserServiceImpl的Save方法被调用");
	}

}
