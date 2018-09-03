package com.javasm.design.factory.abst;

import com.javasm.design.common.channel.IChannelService;
import com.javasm.design.common.pay.IPayService;

/**
 * @author Alex
 * @creartTime 2018/9/3 - 21:41
 * @function 消费者
 */
public class Demo {

    public static void main(String[] args) {
        AbstractFactory factory  = new WechatFactory();
        //支付方式
        IPayService payService=factory.createPayService();
        payService.pay();
        //推广渠道
        IChannelService channelService=factory.createChannelService();
        channelService.push();

    }
}
