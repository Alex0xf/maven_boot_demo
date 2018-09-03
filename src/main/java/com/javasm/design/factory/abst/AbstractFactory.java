package com.javasm.design.factory.abst;

import com.javasm.design.common.channel.IChannelService;
import com.javasm.design.common.pay.IPayService;

/**
 * @author Alex
 * @creartTime 2018/9/3 - 21:33
 * @function 抽象工厂 产品：支付+渠道
 */
public interface AbstractFactory {

    //创建支付
    IPayService createPayService();

    //创建渠道
    IChannelService createChannelService();
}
