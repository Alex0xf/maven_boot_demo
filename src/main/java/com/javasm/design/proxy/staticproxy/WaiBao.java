package com.javasm.design.proxy.staticproxy;

/**
 * @author Alex
 * @creartTime 2018/9/3 - 16:58
 * @function 代理类 外包公司 自己不会写代码 只能调用程序员来写代码
 */
public class WaiBao implements ICodeMonkey{

    private ICodeMonkey codeMonkey;//真正的写代码的程序猿对象

    //初始化的时候 传入真正写代码的实例 把值赋给本类中的程序与对象
    public WaiBao(ICodeMonkey iCodeMonkey) {
        this.codeMonkey = iCodeMonkey;
    }

    @Override
    public void code() {
        System.out.println("收到雇佣公司的工资20000");
        //自己不会写 调用真正诙谐代码人的方法
        codeMonkey.code();
        System.out.println("给程序猿工资10000");
        System.out.println("上五险一金2000");

    }
}
