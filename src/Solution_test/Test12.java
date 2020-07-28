/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Test12
 * Author:   zhangjianfa
 * Date:     2020/6/25 10:51
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solution_test;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/6/25
 * @since 1.0.0
 */

//第三个题，间隔大小写模式
public class Test12 {
    public static void main(String[] args) {
        String string1 = "lengendary";
        char string2[] = string1.toCharArray();
        for (int i = 0; i < string2.length; i+=2) {
            char a = Character.toUpperCase(string2[i]);
            string2[i] = a;
        }
        System.out.println(string2);
    }
}
