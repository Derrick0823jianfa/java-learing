/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestString
 * Author:   zhangjianfa
 * Date:     2020/6/25 9:14
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

//第一题，将首字母转化为大写字母
public class TestString {
    public static void main(String[] args) {
        String sentence = "let there be light";
        String subsentence [] = sentence.split(" ");
        for(String sub:subsentence){
            char c = Character.toUpperCase(sub.charAt(0));
            System.out.print(c);
            System.out.print(sub.substring(1)+" ");

        }
    }

}
