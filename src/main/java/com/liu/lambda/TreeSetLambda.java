package com.liu.lambda;

/**
 * 利用TreeSet集合，实现对存储对象的顺序排序
 * 匿名内部类，替代比较器
 * Created by liuxiaoming on 17/5/8.
 */
import java.util.*;
public class TreeSetLambda {

    public static void main(String[] args){
        //Set<String> set = new TreeSet<String>(new StringLength());
        //上述程序使用"匿名内部类"替换为
      /*  Set<String> set = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int length = s1.length() - s2.length();
                return length == 0?s1.compareTo(s2):length;
            }
        });*/
        //上述程序使用"lambda表达式"替换为
        //lambda   表达式的局限性 ：
        //  1.小括号中的参数必须是固定的
        //  2.该匿名内部类的方法只有一个的情况下才可使用lambda表达式
        Set<String> set = new TreeSet<String>((s1,s2)->{
            int length = s1.length() - s2.length();
            return length == 0?s1.compareTo(s2):length;
        });
        set.add("abc");
        set.add("qfsddsx");
        set.add("easdsadsadsawq");
        set.add("msadsakl");
        System.out.println(set);
    }

}


class StringLength implements Comparator<String>{
            public int compare(String s1,String s2){
                int length = s1.length() - s2.length();
                return length == 0?s1.compareTo(s2):length;
            }
}
