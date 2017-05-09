package com.liu.lambda;

/**
 * 事件中的匿名内部类
 * 活动时间ActionListener接口只有一个抽象方法
 * void actionPerformed(ActionEvent e)
 * Created by liuxiaoming on 17/5/8.
 */
import java.awt.*;
import java.awt.event.*;

public class FrameLambda {
    public static void main(String[] args){
        Frame frame = new Frame("我的窗体");
        //窗体的定位 X轴 Y轴 宽度 高度
        frame.setBounds(200,100,500,400);
        //取消布局管理器
        frame.setLayout(null);
        //是否可见
        frame.setVisible(true);
        Button button = new Button("lambda测试");
        button.setBounds(100,50,100,30);
        frame.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按钮点击了。。。");
            }
        });
    }
}
