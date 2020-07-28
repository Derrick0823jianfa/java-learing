/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestFile
 * Author:   zhangjianfa
 * Date:     2020/7/6 11:01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package File;

import java.io.File;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈文件常用方法〉
 *
 * @author zhangjianfa
 * @create 2020/7/6
 * @since 1.0.0
 */
public class TestFile {
    public static void main(String[] args) {

        //绝对路径
        File f1 = new File("d:/chiji");
        System.out.println(f1.getAbsolutePath());

        //相对路径，当前工作目录
        File f2 = new File("lol.exe");
        System.out.println(f2.getAbsolutePath());

        //以f1为目录，创建文件对象
        File f3 = new File(f1,"lol.exe");
        System.out.println(f3.getAbsolutePath());

        File f = new File("d:/LOLFolder/LOL.exe");
        System.out.println("当前文件是：" +f);
        //文件是否存在
        System.out.println("判断是否存在："+f.exists());

        //是否是文件夹
        System.out.println("判断是否是文件夹："+f.isDirectory());

        //是否是文件（非文件夹）
        System.out.println("判断是否是文件："+f.isFile());

        //文件长度
        System.out.println("获取文件的长度："+f.length());

        //文件最后修改时间
        long time = f.lastModified();
        Date d = new Date(time);
        System.out.println("获取文件的最后修改时间："+d);
        //设置文件修改时间为1970.1.1 08:00:00
        f.setLastModified(0);

        //文件重命名
        File f4 =new File("d:/LOLFolder/DOTA.exe");
        f.renameTo(f4);
        System.out.println("把LOL.exe改名成了DOTA.exe");

        System.out.println("注意： 需要在D:\\LOLFolder确实存在一个LOL.exe,\r\n才可以看到对应的文件长度、修改时间等信息");

    }

}
