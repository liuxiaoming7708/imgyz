package com.liu.java8;

/**
 * Created by liuxiaoming on 17/5/8.
 */
public class Inter8Impl implements Inter8 {
    //Inter8的实现类为了调用Inter8中的默认方法

    //重写默认方法，是可以的，不能写default关键字
    @Override
    public void defaultMethod(){
        System.out.println("默认方法的重写。。。");
    }
}
