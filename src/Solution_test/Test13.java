/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Test13
 * Author:   zhangjianfa
 * Date:     2020/6/25 11:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solution_test;

/**
 * 〈最后一个字母变大写〉<br>
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/6/25
 * @since 1.0.0
 */
public class Test13 {
    public static void main(String[] args) {
        String word = "lengendary";
        char a[] = word.toCharArray();
        char s = Character.toUpperCase(a[a.length-1]);
        a[a.length-1] = s;

        System.out.print(a);

    }

}
