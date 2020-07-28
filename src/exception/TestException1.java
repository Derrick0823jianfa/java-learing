/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestException1
 * Author:   zhangjianfa
 * Date:     2020/7/3 13:32
 * Description:
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
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/7/3
 * @since 1.0.0
 */
public class TestException1 {
    public static void main(String[] args) {
        File f = new File("D:/2konile.exe");

        try {
            new FileInputStream(f);
        }
        catch (FileNotFoundException t){
            t.printStackTrace();
        }
    }
}
