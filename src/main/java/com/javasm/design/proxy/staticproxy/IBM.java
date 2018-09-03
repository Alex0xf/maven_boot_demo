package com.javasm.design.proxy.staticproxy;

/**
 * @author Alex
 * @creartTime 2018/9/3 - 17:03
 * @function 雇佣者 IBM
 */
public class IBM {
    //需要程序猿写代码
    //自己不想找程序猿 找外包公司雇佣程序猿 外派到我司
    public static void main(String[] args) {
//        ICodeMonkey codeMonkey=new WaiBao(new LiLei());
        ICodeMonkey codeMonkey=new WaiBao(new HanMeiMei());
        codeMonkey.code();

    }

}
