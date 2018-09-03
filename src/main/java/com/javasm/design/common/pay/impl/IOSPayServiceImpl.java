package com.javasm.design.common.pay.impl;

import com.javasm.design.common.pay.IPayService;

public class IOSPayServiceImpl implements IPayService{

	@Override
	public void pay() {
		System.out.println("苹果支付");
	}

}
