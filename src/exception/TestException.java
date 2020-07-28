/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestException
 * Author:   zhangjianfa
 * Date:     2020/7/3 10:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/7/3
 * @since 1.0.0
 */
public class TestException {
    public static void main(String[] args) {

        File f = new File("d:/lol.exe");

        try {
            System.out.println("试图打开d盘的文件:lol.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2020-07-03");

        }
        //多异常捕获
        catch (FileNotFoundException | ParseException e){
            //好处是捕捉的代码更紧凑，不足之处是，一旦发生异常，不能确定到底是哪种异常，
            // 需要通过instanceof 进行判断具体的异常类型
            if (e instanceof FileNotFoundException)
                System.out.println("路径不存在");
            if (e instanceof ParseException)
                System.out.println("日历格式解析错误");

            //在命令行打印异常信息和在程序中出错的位置及原因。
            e.printStackTrace();
        }
        //无论如何，finally里的代码都会被执行
        finally {
            System.out.println("这段不管怎样都会执行");
        }
    }
}
