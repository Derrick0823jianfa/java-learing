/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestFile2
 * Author:   zhangjianfa
 * Date:     2020/7/6 11:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package File;

import java.io.IOException;
import java.io.File;

/**
 * 〈一句话功能简述〉<br> 
 * 〈遍历文件夹下所有文件，除子目录，找到最大和最小文件〉
 *
 * @author zhangjianfa
 * @create 2020/7/6
 * @since 1.0.0
 */
public class TestFile2 {
    public static void main(String[] args) throws IOException {
        //获取文件夹对象
        File file=new File("C:\\Users\\15222\\Desktop\\鑫诺卫星入职学习资料");

        //获取文件夹下所有文件
        File allfile[]=file.listFiles();
        for (File file1 : allfile) {
            if(file1.isDirectory())
                continue;
            System.out.println(file1);
        }
        //遍历获取最小的文件
        File Min_Length_File=allfile[0];
        for (File file1 : allfile) {
            if(file1.isDirectory())
                continue;
            if(file1.length()<Min_Length_File.length()){
                Min_Length_File=file1;
            }
        }
        System.out.println("最小的文件是: "+Min_Length_File+",大小为"+Min_Length_File.length()+"字节");

        //遍历获取最大的文件
        File Max_Length_File=allfile[0];
        for (File file1 : allfile) {
            if(file1.isDirectory())
                continue;
            if(file1.length()>Max_Length_File.length()){
                Max_Length_File=file1;
            }
        }
        System.out.println("最大的文件是: "+Max_Length_File+",大小为"+Max_Length_File.length()+"字节");

    }
}
