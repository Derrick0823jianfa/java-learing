/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestDate3
 * Author:   zhangjianfa
 * Date:     2020/6/27 16:32
 * Description: 字符串转日期
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

/**
 * 〈一句话功能简述〉<br> 
 * 〈字符串转日期〉
 *
 * @author zhangjianfa
 * @create 2020/6/27
 * @since 1.0.0
 */
public class TestDate3 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String str = "2020/06/27 16:37:37";

        try {
            Date d = sdf.parse(str);
            System.out.printf("字符串%s通过格式 yyyy/MM/dd HH:mm:ss %n转化为日期对象：%s",
                    str,d.toString());
        }
        catch (ParseException e){
            e.printStackTrace();
        }
    }
}
