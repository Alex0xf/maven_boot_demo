package com.javasm.reflection;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Alex
 * @creartTime 2018/9/1 - 0:26
 * @function
 */
public class Test {

    public static void main(String[] args) throws IllegalAccessException, IntrospectionException, InvocationTargetException {
       /* GameVO gameVO = new GameVO();
        gameVO.setName("LOL");
        gameVO.setGameIOSUrl("IOS");
        GameModel gameModel=gameVO;
        System.out.println("gameModel = " + gameModel);*/

        GameModel gameModel1=new GameModel("SOS");

        FatherToSon<GameVO,GameModel> fatherToSon=new FatherToSon();
        GameVO gameVO1 = fatherToSon.change(new GameVO(), gameModel1);
        System.out.println("gameVO1.getName() = " + gameVO1.getName());

    }

}
