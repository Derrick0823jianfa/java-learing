/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestDate2
 * Author:   zhangjianfa
 * Date:     2020/6/27 16:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/6/27
 * @since 1.0.0
 */
public class TestDate2 {
    public static void main(String[] args) {
        //y 代表年
        //M 代表月
        //d 代表日
        //H 代表24进制的小时
        //h 代表12进制的小时
        //m 代表分钟
        //s 代表秒
        //S 代表毫秒
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = new Date();
        String str = sdf.format(d);
        System.out.println("当前时间通过 yyyy-mm-dd HH:mm:ss的形式表达出来: "+str);



    }

}
