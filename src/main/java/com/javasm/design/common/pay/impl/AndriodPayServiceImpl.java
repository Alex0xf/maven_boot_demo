package com.javasm.design.common.pay.impl;

import com.javasm.design.common.pay.IPayService;

public class AndriodPayServiceImpl implements IPayService{

	@Override
	public void pay() {
		System.out.println("安卓支付");
	}

}
