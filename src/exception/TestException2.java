/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestException2
 * Author:   zhangjianfa
 * Date:     2020/7/3 10:53
 * Description: 测试throws的用法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试throws的用法〉
 *
 * @author zhangjianfa
 * @create 2020/7/3
 * @since 1.0.0
 */
public class TestException2 {
    public static void main(String[] args) {
        method1();
    }
    private static void method1(){
        try{
            method2();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    private static void method2() throws FileNotFoundException{
        File f = new File("d:/lol.exe");
        new FileInputStream(f);
        System.out.println("成功打开");

    }
}
