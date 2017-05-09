package com.liu.java8;

/**
 * Created by liuxiaoming on 17/5/8.
 * jdk8中的接口新特性
 */
public class InterFaceDemo {
     public static void main(String[] args){
         //接口名字直接调用静态方法
          Inter8.method();
         //实现类建立对象来调用默认方法
          //方法非静态的，不能类名调用，需要子对象调用
          //默认方法重写后，直接调用子类的重写方法
          Inter8Impl inter8Impl = new Inter8Impl();
          inter8Impl.defaultMethod();
          //使用多态的特点，接口指向自己的实现类，调用方法
          Inter8 i88 = new Inter8Impl();
          i88.defaultMethod();

     }


}
