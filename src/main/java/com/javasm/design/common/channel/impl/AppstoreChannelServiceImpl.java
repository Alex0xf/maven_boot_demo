package com.javasm.design.common.channel.impl;

import com.javasm.design.common.channel.IChannelService;

public class AppstoreChannelServiceImpl implements IChannelService{

	@Override
	public void push() {
		System.out.println("AppStore推广");
	}

}
