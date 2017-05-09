package com.liu.lambda;

/**
 * File类中的方法，获取一个目录下的文件
 * File类，listFiles()获取File对象封装的目录
 * listFiles方法传递文件过滤器
 * listFiles(FileFilter filter)
 * FileFileter接口，传递借口的实现类对象
 * 只有一个方法public boolean accept(File pathname)
 * Created by liuxiaoming on 17/5/8.
 */
import java.io.*;
public class FileListLambda {
    public static void main(String[] args){
        File dir = new File("/Users/liuxiaoming/Documents/software/ideawork/testwork/imgyz");
        //File[] files = dir.listFiles(new FileXml());
        //上述程序使用"匿名内部类"来替换
       /* File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".xml");
            }
        });*/
        //上述程序使用"lambda表达式"来替换
        File[] files = dir.listFiles((pathname)->{
            return pathname.getName().endsWith(".xml");
        });
        for (File f : files){
            System.out.println(f);
        }

    }
}
//定义文件过滤器，实现FileFilter接口
class FileXml implements FileFilter{
    @Override
    public boolean accept(File pathname) {
        //System.out.println(pathname);
        return pathname.getName().endsWith(".xml");
    }

}
