package com.javasm.design.factory.abst;

import com.javasm.design.common.channel.IChannelService;
import com.javasm.design.common.channel.impl.AppstoreChannelServiceImpl;
import com.javasm.design.common.pay.IPayService;
import com.javasm.design.common.pay.impl.IOSPayServiceImpl;

/**
 * @author Alex
 * @creartTime 2018/9/3 - 21:40
 * @function IOS的产品族群
 */
public class IOSFactory implements AbstractFactory {
    @Override
    public IPayService createPayService() {
        return new IOSPayServiceImpl();
    }

    @Override
    public IChannelService createChannelService() {
        return new AppstoreChannelServiceImpl();
    }
}
