package com.liu.java8;

/**
 * Created by liuxiaoming on 17/5/8.
 */
public class CDemo {
    public static void main(String[] args){
        //实现类的类名不能调用接口中的静态方法
        CImpl c = new CImpl();
        c.defaultMethod();

    }


}
