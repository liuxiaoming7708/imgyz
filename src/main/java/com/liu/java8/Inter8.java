package com.liu.java8;

/**
 * Created by liuxiaoming on 17/5/8.
 */
public interface Inter8 {
    //接口中定义一个静态的带有方法体的方法
    //接口不能建立对象，方法静态方法不需要对象
    //接口名调用
    public static void method(){
        System.out.println("接口中的静态方法。。。");
    }
    //定义接口中的默认方法
    public default void defaultMethod(){
        System.out.println("接口中的默认方法。。。");
    }
}
