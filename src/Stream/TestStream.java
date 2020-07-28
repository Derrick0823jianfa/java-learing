/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestStream
 * Author:   zhangjianfa
 * Date:     2020/7/6 20:15
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/7/6
 * @since 1.0.0
 */
public class TestStream {
    public static void main(String[] args) {
        File f = new File("C:\\百度云下载\\a.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            for(byte b:all){
                System.out.println(b);
            }
            fis.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            //在finally里关闭流
            if(null!=null){
                try {
                    fis.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
