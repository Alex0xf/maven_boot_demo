package com.javasm.design.common.channel.impl;

import com.javasm.design.common.channel.IChannelService;

public class MyappChannelServiceImpl implements IChannelService {

	@Override
	public void push() {
		System.out.println("应用宝渠道推广");
	}

}
