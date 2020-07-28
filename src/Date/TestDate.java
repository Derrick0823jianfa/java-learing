/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestDate
 * Author:   zhangjianfa
 * Date:     2020/6/27 16:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Date;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/6/27
 * @since 1.0.0
 */
public class TestDate {
    public static void main(String[] args) {

        Date d1 = new Date();
        System.out.println(d1.toString());
        System.out.println("Date.getTime()  \t\t\t返回值: "+d1.getTime());
        System.out.println("System.currentTimeMillis() \t返回值: "+System.currentTimeMillis());

        Date d2 = new Date(6000);
        System.out.println(d2);
    }

}
