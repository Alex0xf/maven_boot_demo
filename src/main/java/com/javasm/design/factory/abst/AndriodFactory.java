package com.javasm.design.factory.abst;

import com.javasm.design.common.channel.IChannelService;
import com.javasm.design.common.channel.impl.BaiduChannelServiceImpl;
import com.javasm.design.common.pay.IPayService;
import com.javasm.design.common.pay.impl.AndriodPayServiceImpl;

/**
 * @author Alex
 * @creartTime 2018/9/3 - 21:37
 * @function 安卓的产品族群
 */
public class AndriodFactory implements AbstractFactory {

    @Override
    public IPayService createPayService() {
        return new AndriodPayServiceImpl();
    }

    @Override
    public IChannelService createChannelService() {
        return new BaiduChannelServiceImpl();
    }
}
