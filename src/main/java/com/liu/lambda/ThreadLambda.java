package com.liu.lambda;

/**
 * lambda表达式：替换了原有的匿名内部类的写法
 * lambda表达式的语法结构
 *  (参数1,参数2...)->{
 *     重写方法的内容，不定义方法名
 *  }
 *  局限性：若该匿名内部类中有多个方法则lambda表达式不可用，只能使用传统的匿名内部类来完成
 *
 *  开启多线程，使用lambda表达式来替换匿名内部类
 *
 * Created by liuxiaoming on 17/5/8.
 */
public class ThreadLambda {
    public static void main(String[] args){
        //Runnable r = new Runnable(){public void run(){}};
        //使用lambda表达式简化上述程序

        /* Runnable r  = ()->{
            for (int x=0;x<100;x++){
                System.out.println("run..."+x);
            }
        };
        Thread t = new Thread(r);*/
        //简化上述程序
        Thread t = new Thread(()->{
                for (int x=0;x<100;x++){
                    System.out.println("run..."+x);
                }
        });
        t.start();
        for (int x=0;x<100;x++){
            System.out.println("main..."+x);
        }
    }

}
