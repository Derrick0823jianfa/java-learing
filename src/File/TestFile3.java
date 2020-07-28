/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestFile3
 * Author:   zhangjianfa
 * Date:     2020/7/6 16:37
 * Description: 遍历所有文件夹包括子文件夹，找到最大文件和最小文件
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package File;

import java.io.File;

/**
 * 〈一句话功能简述〉<br> 
 * 〈遍历所有文件夹包括子文件夹，找到最大文件和最小文件〉
 *
 * @author zhangjianfa
 * @create 2020/7/6
 * @since 1.0.0
 */
public class TestFile3 {
    static long maxL = 0;
    static long minL = Integer.MAX_VALUE;
    static File maxF = null;
    static File minF = null;

    //构建类方法，没有用到任何的对象属性
    public static void ListFile(File file){
        if(file.isFile()){
            if(file.length()>maxL){
                maxF = file;
                maxL = file.length();
            }
            if(file.length()!=0 && file.length()<minL){
                minF = file;
                minL = file.length();
            }
        }
        if(file.isDirectory()){
            File fs[] = file.listFiles();
            for(File f:fs){
                //用了递归算法，构建无限次循环
                ListFile(f);
            }
        }
    }

    public static void main(String[] args) {
        File f = new File("C:\\Users\\15222\\Desktop\\鑫诺卫星入职学习资料");
        ListFile(f);
        System.out.println("最大文件是"+maxF.getAbsolutePath()+"大小是"+maxL);
        System.out.println();
        System.out.println("最小文件是"+minF.getAbsolutePath()+"大小是"+minL);
    }

}
