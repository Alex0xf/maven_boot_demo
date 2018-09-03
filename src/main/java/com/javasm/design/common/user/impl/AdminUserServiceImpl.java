package com.javasm.design.common.user.impl;
import com.javasm.design.common.user.IUserService;
public class AdminUserServiceImpl implements IUserService{

	@Override
	public void save() {

		System.out.println("管理员角色的用户save方法被调用");
	}

}
