package com.javasm.design.common.pay.impl;

import com.javasm.design.common.pay.IPayService;

public class WechatPayServiceImpl implements IPayService{

	@Override
	public void pay() {
		System.out.println("微信支付");
	}

}
