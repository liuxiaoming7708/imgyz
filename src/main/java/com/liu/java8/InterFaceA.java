package com.liu.java8;

/**
 * Created by liuxiaoming on 17/5/8.
 */
public interface InterFaceA {
    public static void a(){
        System.out.println("接口A中的静态方法a()。。。");
    }
    public default void defaultMethod(){
        System.out.println("接口A中的默认方法。。。");
    }
}
