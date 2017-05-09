package com.liu.java8;

/**
 * 同时实现InterFaceA,InterFaceB两个接口
 * Created by liuxiaoming on 17/5/8.
 */
public class CImpl implements InterFaceA,InterFaceB {
    //若接口A和B中有相同的默认方法，则实现类必须重写该方法
    @Override
    public void defaultMethod(){
        System.out.println("重写接口A和B的默认方法。。。");
    }
}
