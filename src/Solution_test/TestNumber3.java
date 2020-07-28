/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: TestNumber3
 * Author:   zhangjianfa
 * Date:     2020/6/23 23:24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solution_test;

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zhangjianfa
 * @create 2020/6/23
 * @since 1.0.0
 */
public class TestNumber3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input string");
        String str = scanner.nextLine();
        char[] cs = str.toCharArray();
        for (Character ch:cs) {
            if (Character.isUpperCase(ch)||(Character.isDigit(ch))){
                System.out.print(ch);
            }

        }
    }

}
