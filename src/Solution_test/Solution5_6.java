package Solution_test; /**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Solution_test.Solution5_6
 * Author:   zhangjianfa
 * Date:     2020/5/6 9:43
 * Description: 5/6练习
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈5/6练习〉
 *
 * @author zhangjianfa
 * @create 2020/5/6
 * @since 1.0.0
 */
import java.util.Scanner;

public class Solution5_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("今天周几？");
        int g=s.nextInt();
        if(g<1 || g>7) {
            System.out.println("输入错误！");
            return;
        }
        String k=g>5?"今天是周末":"今天是工作日";
        System.out.println(k);
    }
}
