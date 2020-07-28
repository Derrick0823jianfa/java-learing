/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Test5_10
 * Author:   zhangjianfa
 * Date:     2020/5/9 8:56
 * Description: 5/10
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package Solution_test;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈5/10〉
 *
 * @author zhangjianfa
 * @create 2020/5/9
 * @since 1.0.0
 */
public class Test5_10 {
    public static void main(String[] args) {
        int a [] = new int[] { 18, 62, 68, 82, 65, 9 };
        int b [] = new int[] {18,62,68,82,65,10};

        // copyOfRange(int[] original, int from, int to)
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)
        //int[] b = Arrays.copyOfRange(a, 0, 3);
        //String content = Arrays.toString(a);
        System.out.println(Arrays.equals(a,b));
        }
    }


