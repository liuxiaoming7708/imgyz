package com.liu.lambda;

/**
 * 多线程开启案例
 * 实现Runnable接口方法
 * Created by liuxiaoming on 17/5/8.
 */

class Demo implements Runnable{

    @Override
    public void run() {
        for(int x = 0; x < 100; x++){
            System.out.println("Run..."+ x);
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args){
        Thread thread = new Thread(new Demo());
        thread.start();
        for (int x=0;x<100;x++){
            System.out.println("Main..."+ x);
        }
    }

}
