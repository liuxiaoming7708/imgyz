package com.liu.lambda;

/**
 *
 * 开启多线程，采用匿名内部类来实现
 * Created by liuxiaoming on 17/5/8.
 */
public class ThreadDemo1 {
    public static void main(String[] args){
        //直接 new Runnable(){}接口
        Thread thread = new Thread(new Runnable(){
            public void run(){
                for (int x=0; x<100; x++){
                    System.out.println("run..."+x);
                }
            }
        });
        thread.start();
        for (int x = 0; x < 100; x++){
            System.out.println("mian..."+x);
        }
    }
}
