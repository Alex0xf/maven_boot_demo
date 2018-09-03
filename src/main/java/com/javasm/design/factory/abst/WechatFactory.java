package com.javasm.design.factory.abst;

import com.javasm.design.common.channel.IChannelService;
import com.javasm.design.common.channel.impl.XiaomiChannerServiceImpl;
import com.javasm.design.common.pay.IPayService;
import com.javasm.design.common.pay.impl.WechatPayServiceImpl;

/**
 * @author Alex
 * @creartTime 2018/9/3 - 21:44
 * @function
 */
public class WechatFactory implements AbstractFactory {
    @Override
    public IPayService createPayService() {
        return new WechatPayServiceImpl();
    }

    @Override
    public IChannelService createChannelService() {
        return new XiaomiChannerServiceImpl();
    }
}
