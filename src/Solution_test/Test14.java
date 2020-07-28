/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Test14
 * Author:   zhangjianfa
 * Date:     2020/6/26 10:19
 * Description: 最后一个two单词首字母大写
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solution_test;

/**
 * 〈一句话功能简述〉<br> 
 * 〈最后一个two单词首字母大写〉
 *
 * @author zhangjianfa
 * @create 2020/6/26
 * @since 1.0.0
 */
public class Test14 {
    public static void main(String[] args) {
        String word = "Nature has given us that two ears, two eyes, and but one tongue, " +
                "to the end that we should hear and see more than we speak\n";
        char a[] = word.toCharArray();
        char s = Character.toUpperCase(a[word.lastIndexOf("two")]);
        a[word.lastIndexOf("two")] = s;
        System.out.print(a);


    }
}
