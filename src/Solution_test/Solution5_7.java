package Solution_test; /**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Solution_test.Solution5_7
 * Author:   zhangjianfa
 * Date:     2020/5/6 21:36
 * Description: 5/7测试用例
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br> 
 * 〈5/7测试用例〉
 *
 * @author zhangjianfa
 * @create 2020/5/6
 * @since 1.0.0
 */
public class Solution5_7 {
    public static void main(String[] args) {
        System.out.println("请输入一个月份:");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch (month){
            case(1):
                System.out.println("冬天");
                break;
            case(2):
                System.out.println("冬天");
                break;
            case (3):
                System.out.println("冬天");
                break;
            default:
                System.out.println("输入的数据有误，请重新输入！");

        }
    }

}
