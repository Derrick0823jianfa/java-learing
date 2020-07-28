/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestOutputStream
 * Author:   zhangjianfa
 * Date:     2020/7/6 20:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br> 
 * 〈以字节流形式向文件写入数据，其中目录不存在的时候，应该怎么处理〉
 *
 * @author zhangjianfa
 * @create 2020/7/6
 * @since 1.0.0
 */
public class TestOutputStream {
    public static void main(String[] args) {
        try {
            File f = new File("C:/百度云下载/一级目录/二级目录/b.txt");
            if(!f.exists())
                f.getParentFile().mkdirs();
            byte Data[] = {88,89};
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(Data);
            fos.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

}
