/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestDate4
 * Author:   zhangjianfa
 * Date:     2020/6/27 16:48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/6/27
 * @since 1.0.0
 */
public class TestDate4 {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static String format(Date time){
        return sdf.format(time);
    }

    public static void main(String[] args) {
        //采用单例模式
        Calendar c = Calendar.getInstance();
        Date now = c.getTime();
        //当前日期
        System.out.println("当前日期：  \t\t" +format(c.getTime()));

        //下个月的第三天
        c.set(2020,05,01);
        c.add(Calendar.MONTH,1);
        c.add(Calendar.DATE,3);
        System.out.println("下个月的第三天： \t" +format(c.getTime()));

        //去年的今天
        //set的月份是从0开始的，而日期是从1开始的。
        c.set(2020,05,01);
        c.add(Calendar.YEAR,-1);
        System.out.println("去年的今天： \t" +format(c.getTime()));

        //上个月第三天
        c.setTime(now);
        c.add(Calendar.MONTH,-1);
        c.add(Calendar.DATE,3);
        System.out.println("上个月的第三天： \t" +format(c.getTime()));

        //下个月倒数第三天
        c.setTime(now);

        c.add(Calendar.MONTH,1);
        c.add(Calendar.DATE,-2);
        System.out.println("下个月倒数第三天：" +format(c.getTime()));


    }

}
